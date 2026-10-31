public class Students {
    int marks;

    Students(int marks) {
        this.marks = marks;
    }
}
 class test
{
    static void change(int x,Students s)
    {
        x=100;
        s.marks=95;
    }
    public static void main(String[]args)
    {
        int n=20;
        Students st=new Students(60);
        change(n,st);
        System.out.println(n);
        System.out.println(st.marks);
    }
}
