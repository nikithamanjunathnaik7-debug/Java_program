public class Person {
    String name;

    Person(String n) {
        name = n;
    }
}

    class Employee1 extends Person {
        int id;

        Employee1(String n, int i) {
            super(n);
            id = i;
        }
    }

    class Manager extends Employee1 {
        double salary;

        Manager(String n, int i, double s) {
            super(n, i);
            salary = s;
        }

        void display() {
            System.out.println(name);
            System.out.println(id);
            System.out.println(salary);
        }
    }

    class p1 {
        public static void main(String[] args) {
            Manager m = new Manager("Ram", 101, 30000);
            m.display();
        }
    }
