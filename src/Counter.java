class Counter {
    static int count = 0;

    static {
        System.out.println("Static block");
    }

    {
        count++;
        System.out.println("Instance block");
    }

    Counter() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(count);
    }
}