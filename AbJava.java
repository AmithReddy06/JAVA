 class Trying
{
    public int a=10;
    public void show(){
        System.out.println("super show");
    }
     void tell()
    {
        System.out.println("Telling method.");
    }
}

class AbJava extends Trying
{
    // private int a=20;

    public void show()
    {
System.out.println("sub no compile show");
        super.show();

    }
    public void tell()
    {
        System.out.println("Showing method.");
        // System.out.println(a);
        // System.out.println(super.a);
    }


    public static void main(String[] args) {
        AbJava a=new AbJava();
        a.show();
    }


  
}