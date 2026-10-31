class University {
    static class Department {
        void display() {
            System.out.println("Computer Science");
        }
    }

    class Faculty {
        void display() {
            System.out.println("Faculty: Ravi");
        }
    }

    public static void main(String[] args) {
        University u = new University();

        Department d = new Department();
        Faculty f = u.new Faculty();

        d.display();
        f.display();
    }
}

