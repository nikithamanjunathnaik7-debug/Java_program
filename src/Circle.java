public class Circle {
    double r;
    void CalculateArea()
    {
        double area=3.14*r*r;
        System.out.println("Area of circle="+area);
    }
    void CalculateCircumference()
    {
        double cir=2*3.14*r;
        System.out.println("Circumference of circle="+cir);
    }
    public static void main(String[] args)
    {
        Circle c=new Circle();
        c.r=5;
        c.CalculateArea();
        c.CalculateCircumference();
    }
}
