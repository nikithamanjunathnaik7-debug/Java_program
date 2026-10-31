public class Employee {
    int id;
    String name;

    Employee(int i, String n) {
        id = i;
        name = n;
    }

    double salary() {
        return 0;
    }
}

    class PermanentEmployee extends Employee {
        PermanentEmployee(int i, String n) {
            super(i, n);
        }

        double salary() {
            return 20000 + 5000;
        }
    }

    class ContractEmployee extends Employee {
        ContractEmployee(int i, String n) {
            super(i, n);
        }

        double salary() {
            return 10000;
        }
    }

    class Main {
        public static void main(String[] args) {
            Employee e = new PermanentEmployee(1, "Ram");
            System.out.println(e.salary());

            Employee e2 = new ContractEmployee(2, "Ravi");
            System.out.println(e2.salary());
        }
    }

