import java.util.*;
class fibo {

    public static void main(String[] args)
    {
        List<Integer> l=new ArrayList<>();

        int n=10;
        for(int i=0;i<n;i++)
        {
            l.add(fib(i));
        }
        System.out.println(l);
    }
   static int fib(int n) {
    if(n<2)
    {
            return n;
    }
    System.out.println();
    return fib(n-1)+fib(n-2);
    }
}