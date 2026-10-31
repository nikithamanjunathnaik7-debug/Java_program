
class Studentss {
    String name;
    int m1, m2, m3;

    static int count = 0;
    final int MAX = 100;

    Studentss(String n, int a, int b, int c) {
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
        count++;
    }

    void display() {
        int total = m1 + m2 + m3;

        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / 3.0);
    }

    public static void main(String[] args) {
        Studentss s = new Studentss("Rahul", 80, 90, 85);
        s.display();

        System.out.println("Count: " + count);
    }
}
