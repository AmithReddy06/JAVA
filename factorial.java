class factorial {
    public static void main(String[] args) {
        
        System.out.println(fact(6));

        for(int i=0;i<=7;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }

    static int fact(int i)
    {
        if(i<2)
        {
            return 1;
        }
        else
            {
                return i*fact(i-1);
            }
    }

    static int fib(int i)
    {
        if(i<1)
        {
            return 1;
        }
        else
        {
            return fib(i-1) + fib(i-2);
        }
    }
}