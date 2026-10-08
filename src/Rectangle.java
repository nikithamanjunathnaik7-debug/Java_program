public class Rectangle {
    int l;
    int b;
    void CalculateArea()
    {
        int area=l*b;
        System.out.println("Area of rectangle="+area);
    }
    public static void main(String[]args)
    {
        Rectangle r=new Rectangle();
        r.l=10;
        r.b=5;
        r.CalculateArea();
    }
}
