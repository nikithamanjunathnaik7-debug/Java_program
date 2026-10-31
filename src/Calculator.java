public class Calculator {
    int calculator(int a,int b)
    {
        return a+b;
    }
    double calculate(double a,double b)
    {
        return a*b;
    }
    int calculate(int a,int b,int c)
    {
        return Math.max(b,c);
    }
    double calaculate(int a,double b)
    {
        return a-b;
    }
    public static void main(String[]args)
    {
        Calculator c =new Calculator();
        System.out.println("Sum:"+c.calculate(10,20));
        System.out.println("Product:"+c.calculate(10.5,25.5));
        System.out.println("Sum:"+c.calculate(10,20,30));
        System.out.println("Sum:"+c.calculate(10,2.2));
    }

}
