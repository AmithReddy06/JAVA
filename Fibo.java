class Fibo 
{
    public void fibo(int n)
    {
        int first=0;
        int second=1;

        for(int i=0;i<=n;i++)
        {

            int sum=first+second;
            System.out.print(sum+" ");
            first=second;
            second=sum;
        }
    }
    public static void main(String args[])
    {

        Fibo f=new Fibo();
        f.fibo(10);
    }
}