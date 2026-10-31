public class Person1 {
    String name;
    int age;

    static int count = 0;
    final String college = "ABC College";

    Person1(String n, int a) {
        name = n;
        age = a;
        count++;
    }

    void display1() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Student1 extends Person1 {
    int roll;

    Student1(String n, int a, int r) {
        super(n, a);
        roll = r;
    }

    void display() {
        super.display1();
        System.out.println("Roll No: " + roll);
    }
}

class Faculty1 extends Person1 {
    String subject;

    Faculty1(String n, int a, String s) {
        super(n, a);
        subject = s;
    }

    void display1() {
        super.display1();
        System.out.println("Subject: " + subject);
    }
}

class Administrator1 extends Person1 {
    String role;

    Administrator1(String n, int a, String r) {
        super(n, a);
        role = r;
    }

    void display1() {
        super.display1();
        System.out.println("Role: " + role);
    }
}

class p2 {
    public static void main(String[] args) {
        Person1[] p = {
                new Student1("Ram", 20, 101),
                new Faculty1("Ravi", 40, "Java"),
                new Administrator1("Raj", 35, "Manager")
        };

        for (Person1 x : p) {
            x.display1();
            System.out.println();
        }

        System.out.println("Total: " + Person1.count);
    }
}

