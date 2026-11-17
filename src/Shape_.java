public class Shape_ {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

    class Circle2 extends Shape_ {
        void draw() {
            System.out.println("Drawing Circle");
        }

        void erase() {
            System.out.println("Erasing Circle");
        }
    }

    class Triangle3 extends Shape_ {
        void draw() {
            System.out.println("Drawing Triangle");
        }

        void erase() {
            System.out.println("Erasing Triangle");
        }
    }

    class Square3 extends Shape_ {
        void draw() {
            System.out.println("Drawing Square");
        }

        void erase() {
            System.out.println("Erasing Square");
        }
    }

    class Main3 {
        public static void main(String[] args) {
            Shape_ s;

            s = new Circle2();
            s.draw();
            s.erase();

            s = new Triangle3();
            s.draw();
            s.erase();

            s = new Square3();
            s.draw();
            s.erase();
        }
    }

