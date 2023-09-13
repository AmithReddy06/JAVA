import java.util.Scanner;
interface Staffop
{
    public void calSal();
}

interface Studentop
{
    public void calFee();
}

class Person
{
    String name;
    String phone_no;

    Person(String name,String phone_no)
    {
        this.name=name;
        this.phone_no=phone_no;
    }

    public void show()
    {
        System.out.print("NAME:"+name+"\nPHONE NO:"+phone_no);
    }
}

class Staff extends Person implements Staffop
{
    String empid;
    String desig;

    Staff(String name,String phone_no,String empid,String desig)
    {
        super(name,phone_no);
        this.empid=empid;
        this.desig=desig;
    }

    public void show()
    {
        super.show();
        System.out.println("EMPID:"+empid+"\nDESIGNATION:"+desig);
    }

    @Override
    public void calSal()
    {
        System.out.println("Enter your basic pay:");
        Scanner sal=new Scanner(System.in);
        int basic=sal.nextInt();
        System.out.println("\nTotal is:"+basic);
    }
}

class Student extends Person implements Studentop
{
    String usn;
    String branch;

    Student(String name,String phone_no,String usn,String branch)
    {
        super(name,phone_no);
        this.usn=usn;
        this.branch=branch;
    }

    public void show()
    {
        super.show();
        System.out.print("USN:"+usn+"\nBRANCH:"+branch+"\n");
    }


    @Override
    public void calFee()
    {
        System.out.println("Enter your fee pay:");
        Scanner fee=new Scanner(System.in);
        int f=fee.nextInt();
        System.out.println("your total is:"+(f+1000));
    }
}

public class Practice
{
    public static void main(String args[])
    {

        while(true)
        {
        System.out.print("\n1.Student Data\n2.Staff Data\n0.Exit \nEnter your option:\n");
            Scanner option=new Scanner(System.in);
            int oo=option.nextInt();
            option.nextLine();
            switch(oo)
            {
            case 1:
            System.out.println("Enter name:");
            String Sn=option.nextLine();
            System.out.println("Enter phone_no:");
            String Sp=option.nextLine();
            System.out.println("Enter usn:");
            String usn=option.nextLine();
            System.out.println("Enter branch:");
            String branch=option.nextLine();
            
            Student student=new Student(Sn,Sp,usn,branch);
            student.show();
            student.calFee();

            break;

            case 2:

            Scanner s=new Scanner(System.in);

            System.out.println("Enter name:");
            String n=s.nextLine();
            System.out.println("Enter phone_no:");
            String p=s.nextLine();
            System.out.println("Enter empid:");
            String e=s.nextLine();
            System.out.println("Enter designation:");
            String d=s.nextLine();
            
            Staff staff=new Staff(n,p,e,d);
            staff.show();
            staff.calSal();

            break;

            case 0:
            System.exit(0);

            default:
            System.out.print("Invalid option chosen.");

            }
        }

        
       
            

            // Scanner s2=new Scanner(System.in);



        
    }
}