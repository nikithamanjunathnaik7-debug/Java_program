public class Payment  {
    double calculate(double amount) {
        return amount;
    }

    double calculate(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}

class CardPayment extends Payment {
    double calculate(double amount) {
        return amount + 20;
    }
}

class UPIPayment extends Payment {
    double calculate(double amount) {
        return amount + 10;
    }
}

class Main1 {
    public static void main(String[] args) {
        Payment p;

        p = new CardPayment();
        System.out.println(p.calculate(1000));

        p = new UPIPayment();
        System.out.println(p.calculate(1000));

        Payment obj = new Payment();
        System.out.println(obj.calculate(1000, 10));
    }
}

