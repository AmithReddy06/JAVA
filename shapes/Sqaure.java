package shapes;

public class Sqaure{

    private double side;
    public Sqaure(double side)
    {
        this.side=side;
    }

    public double getArea()
    {
        return side*side;
    }

    public double getPerimeter()
    {
        return 4 * side;
    }
}
