public class Complex {
    int real,imag;
    Complex(int r,int i)
    {
        real=r;
        imag=i;
    }
    Complex add(Complex c)
    {
        return new Complex(real+c.real,imag+c.imag);
    }
    Complex multiply(Complex c)
    {
        return new Complex(real*c.real-imag*c.imag,real*c.imag+imag*c.real);
    }
    void comparemagn(Complex c) {
        double m1 = Math.sqrt(real * real + imag * imag);
        double m2 = Math.sqrt(c.real * c.real + c.imag * c.imag);
        if (m1 > m2)
            System.out.println("First is greater");
        else if (m1 < m2)
            System.out.println("second is greater");
        else
            System.out.println("Both are equal");
    }
    Complex copy()
    {
        return new Complex(real,imag);
    }
    void display()
    {
        System.out.println(real+"+"+imag+"i");
    }
    public static void main(String[]args)
    {
        Complex c1=new Complex(3,2);
        Complex c2=new Complex(2,1);
        c1.add(c2).display();
        c1.multiply(c2).display();
        c1.comparemagn(c2);
        c1.copy().display();
    }
}
