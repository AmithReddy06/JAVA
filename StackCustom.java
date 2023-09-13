import java.util.Arrays;

class StackCustom
{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr=-1;

    public StackCustom()
    {
        this(DEFAULT_SIZE);
    }

    public StackCustom(int size)
    {
        this.data=new int[size];
    }

    public boolean push(int item)
    {
       if(isFull())
       {
        System.out.println("Stack full");
       }
       ptr++;
       data[ptr]=item;
       return true;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Empty!");
        }
        return data[ptr--];
    }

    private boolean isFull()
    {
        return ptr == data.length -1;
    }

    private boolean isEmpty()
    {
        return ptr == -1;
    }


    public static void main(String[] args) {
        StackCustom sc = new StackCustom(DEFAULT_SIZE);
        sc.push(23);
        sc.push(56);
        sc.push(89);
        sc.pop();
        sc.push(67);

        sc.push(45);
        sc.pop();
        sc.pop();
        sc.pop();
        sc.pop();
        sc.pop();
        sc.pop();
        sc.pop();

        
    }
    

}