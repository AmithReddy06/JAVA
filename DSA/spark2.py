from pyspark.sql import SparkSession
from pyspark.sql.types import StructType, StructField, StringType, DoubleType
from pyspark.sql.functions import udf
from textblob import TextBlob

# Create a SparkSession
spark = SparkSession.builder.appName("SentimentAnalysis").getOrCreate()

# Define the schema for the streaming DataFrame.
schema = StructType([
    StructField("id", StringType(), True),  # Use StringType for "id"
    StructField("date", StringType(), True),
    StructField("query", StringType(), True),
    StructField("user", StringType(), True),
    StructField("text", StringType(), True)
])

# Create a streaming DataFrame by reading data from the CSV file.
# Replace 'path_to_dataset' with the actual path to your dataset file.
streaming_df = spark.readStream.csv('/home/amith/Documents/twitter.csv', schema=schema)

# Define a UDF to perform sentiment analysis using TextBlob
def analyze_sentiment(text):
    sentiment = TextBlob(text).sentiment.polarity
    return sentiment

# Register UDF
analyze_sentiment_udf = udf(analyze_sentiment, DoubleType())

# Apply sentiment analysis to the streaming DataFrame
streaming_df_with_sentiment = streaming_df.withColumn("sentiment", analyze_sentiment_udf(streaming_df["text"]))

# Define a function to write the output of each micro-batch to a location
def write_to_location(df, epoch_id):
    # Define the output location
    output_location = f"/home/amith/sptrash/{epoch_id}"  # Replace with your desired output path
    
    # Write the DataFrame to the output location as Parquet
    df.write.parquet(output_location, mode="overwrite")

# Write the streaming output using foreachBatch
query = streaming_df_with_sentiment.writeStream \
    .outputMode("append") \
    .foreachBatch(write_to_location) \
    .start()

# Wait for the query to finish
query.awaitTermination()

# Stop the Spark session
spark.stop()
