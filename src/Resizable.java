 interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

    class Rectangle_ implements Resizable {
        int width, height;

        Rectangle_(int w, int h) {
            width = w;
            height = h;
        }

        public void resizeWidth(int w) {
            width = w;
        }

        public void resizeHeight(int h) {
            height = h;
        }

        void display() {
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
        }
    }

     class Main4 {
        public static void main(String[] args) {
            Rectangle_ r = new Rectangle_(10, 20);

            System.out.println("Original Rectangle:");
            r.display();

            r.resizeWidth(30);
            r.resizeHeight(40);

            System.out.println("Resized Rectangle:");
            r.display();
        }
    }

