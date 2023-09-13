import java.util.Arrays;

class mergesort
{
    public static void main(String[] args) {
        
        int[] a1=new int[]{43,2,45,22,4,123,4};

        System.out.println(Arrays.toString(a1));
        a1 = MergeSort(a1);
        System.out.println(Arrays.toString(a1));
    }

    static int[] MergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int mid=arr.length/2;

        int[] left=MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=MergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {

        int i=0,j=0,k=0;
        int[] mix=new int[first.length+second.length];

        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k++]=first[i++];
            }
            else
            {
                mix[k++]=second[j++];
            }
        }

        while(i<first.length)
        {
            mix[k++]=first[i++];
        }
        while(j<second.length)
        {
            mix[k++]=second[j++];
     
        }

        return mix;
    }
    // static int[] Mergesort(int[] arr)
    // {
    //    if(arr.length == 1)
    //    {
    //     return arr;
    //    } 

    //    int mid=arr.length/2;

    //    int[] left=Mergesort(Arrays.copyOfRange(arr, 0, mid));
    //    int[] right=Mergesort(Arrays.copyOfRange(arr, mid, arr.length));

    //    return merge(left,right);
    // }

    //   private static int[] merge(int[] first, int[] second) {

    //     int[] mix = new int[first.length+second.length];
    //     int i=0;
    //     int j=0;
    //     int k=0;

    //     while(i<first.length && j<second.length)
    //     {
    //         if(first[i]<second[j])
    //         {
    //             mix[k++]=first[i++];
    //         }
    //         else
    //         {
    //             mix[k++]=second[j++];
    //         }
    //     }

    //     while(i< first.length)
    //     {
    //         mix[k++]=first[i++];
    //     }
    //     while(j<second.length)
    //     {
    //         mix[k++]=second[j++];
    //     }

    //     return mix;
    // }

  
}