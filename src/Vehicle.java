public class Vehicle {
    String brand = "Toyota";
}

    class Car extends Vehicle {
        String brand = "BMW";

        void display() {
            System.out.println(super.brand);
            System.out.println(brand);
        }
    }

    class v1{
        public static void main(String[] args) {
            Car c = new Car();
            c.display();
        }
    }
