
class Studentss {
    String name,usn;
    int m1, m2, m3;

    static int count = 0;
    final int MAX = 100;

    Studentss(String n,String u, int a, int b, int c) {
        name = n;
        usn=u;
        m1 = validate(a);
        m2 = validate(b);
        m3 =validate(c);
        count++;
    }
int validate(int marks)
{
if(marks>=0&&marks<=MAX)
    return marks;
return 0;
}
String getName()
{
return name;
}
String getUsn()
{
    return usn;
}
int total()
{
    return m1+m2+m3;
}
double average()
{
return total()/3.0;
}
void display()
{
System.out.println("USN="+usn);
System.out.println("Name="+name);
}
void display(boolean result)
{
    display();
    System.out.println("Total="+total());
    System.out.println("Average="+average());
}
Result getResult()
{
    return new Result(total(),average());
}
}
class Result
{
    int total;
    double average;
    Result(int t,double a)
    {
        total=t;
        average=a;
    }
    void show()
    {
        System.out.println("Result total="+total);
        System.out.println("Result average="+average);
    }
}
class StudentResultTest
{
    public static void main(String[]args)
    {
        Studentss s=new Studentss("101","Ron",40,50,60);
        s.display(true);
        Result r=s.getResult();
        r.show();
        System.out.println("Student Count="+Studentss.count);
    }
}

