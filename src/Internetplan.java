public class Internetplan {
    String plan;
    int data;
    double price;
    Internetplan()
    {
        this("Basic",10,299);
    }
    Internetplan(String plan,int data)
    {
        this(plan,data,249);
    }
    Internetplan(String plan,int data,double price)
    {
        this.plan=plan;
        this.data=data;
        this.price=price;
    }
    void display()
    {
        System.out.println("Plan:"+plan);
        System.out.println("Data:"+data);
        System.out.println("Price:"+price);
    }
    public static void main(String[]args)
    {
        Internetplan p=new Internetplan();
        p.display();
        Internetplan p2=new Internetplan("Premium",50);
        p2.display();


    }
}
