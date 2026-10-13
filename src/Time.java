public class Time {
    Time(int sec)
    {
        System.out.println("Time in seconds:"+sec);
    }
    Time(double min,float hrs)
    {
        System.out.println("Time in minutes:"+min);
        System.out.println("Time in hours:"+hrs);
    }
    Time(int sec,double min,float hrs)
    {
        System.out.println("Time in sec:"+sec);
        System.out.println("Time in min:"+min);
        System.out.println("Time in hours"+hrs);
    }
    public static void main(String[]args)
    {
        new Time(30);
        new Time(5.0,6);
        new Time(3,5.6,2.0f);
    }
}
