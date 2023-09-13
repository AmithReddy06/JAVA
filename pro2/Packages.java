import shapes.*;
import java.util.Scanner;

public class Packages {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the parameters properly:");

        System.out.println("CIRCLE DETAILS:");
        System.out.println("Enter the radius of the circle:");
        int radius=s.nextInt();

        
        System.out.println("TRIANGLE DETAILS:");
        System.out.println("Enter the base length of the triangle:");
        int base=s.nextInt();
        System.out.println("Enter the height length of the triangle:");
        int height=s.nextInt();

        System.out.println("SQUARE DETAILS:");
        System.out.println("Enter the length of side of the sqaure:");
        int side=s.nextInt();

        Sqaure square = new Sqaure(side);
        Triangle triangle = new Triangle(base,height);
        Circle circle = new Circle(radius);


        while(true)
        {
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("1.CIRCLE\n2.TRIANGLE\n3.SQUARE\n");
            System.out.println("Enter your option:");
            int option=s.nextInt();
            s.nextLine();

            switch(option)
            {
                case 1:

                System.out.println("CIRCLE AREA: "+circle.getArea());
                System.out.println("CIRCLE CIRCUMFERENCE:"+circle.getCircumference());
          
                break;
                case 2:
                 System.out.println("SQUARE AREA: "+square.getArea());
                System.out.println("SQUARE PERIMETER:"+square.getPerimeter());
                break;
                case 3:
                 System.out.println("TRIANGLE AREA: "+triangle.getArea());
                System.out.println("TRIANGLE PERIMETER:"+triangle.getPerimeter());
          
            }

        }


    }
}