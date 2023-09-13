// import java.lang.Thread;
// class Thread1 extends Thread{
//     public void run()
//     {
//         for(int i=0;i<=10;i++)
//         {
//             System.out.println("Thread1: "+i);
//             try{
//                 Thread.sleep(2000);
//             }
//             catch(InterruptedException e)
//             {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class Thread2 extends Thread{
//     public void run()
//     {
//         for(int i=10;i<=15;i++)
//         {
//             System.out.println("Thread2: "+i);
//             try{
//                 Thread.sleep(2000);
//             }
//             catch(InterruptedException e)
//             {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class ThreadLC
// {
//     public static void main(String[] args) {
//         Thread1 t1=new Thread1();
//         Thread2 t2=new Thread2();

//         t1.start();
//         t2.start();

//         try{
//             Thread.sleep(7000);
//         }
//         catch(InterruptedException e)
//         {
//             e.printStackTrace();
//         }

//         t1.interrupt();
//         t2.interrupt();

//         try{
//             t1.join();
//             t2.join();
//         }
//         catch(InterruptedException e)
//         {
//             e.printStackTrace();
//         }

//         System.out.println("Done");
//     }
// }

import java.lang.Thread;

class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
                    System.out.println("Thread 1:"+i);
                    try{
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }

        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i=10;i<=15;i++)
        {
                    System.out.println("Thread 2:"+i);
                    try{
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }

        }
    }
}


public class ThreadLC
{
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.start();
        t2.start();

        try{
            Thread.sleep(7000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        t1.interrupt();
        t2.interrupt();

        try
        {
            t1.join();
            t2.join();
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}