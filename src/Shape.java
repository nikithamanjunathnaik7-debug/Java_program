public class Shape {
    void area() {
        System.out.println("Area");
    }
}

   class Circle1 extends Shape {
        void area() {
            System.out.println(3.14 * 5 * 5);
        }
    }

    class Rectangle1 extends Shape {
        void area() {
            System.out.println(10 * 5);
        }
    }

    class Triangle1 extends Shape {
        void area() {
            System.out.println(0.5 * 10 * 5);
        }
    }

    class t1{
        public static void main(String[] args) {
            Shape s;

            s = new Circle1();
            s.area();

            s = new Rectangle1();
            s.area();

            s = new Triangle1();
            s.area();
        }
    }

