 class BankAccount1 {
    private double balance;
    static int count = 0;
    final int id;

    BankAccount1(double b) {
        balance = b;
        id = ++count;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

 class test1
{
        public static void main(String[] args) {
            BankAccount1 b = new BankAccount1(5000);
            b.deposit(1000);
            b.withdraw(2000);
            b.display();
        }
    }

