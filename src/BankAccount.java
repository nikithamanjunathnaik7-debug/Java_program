public class BankAccount {
    String account_holder_name;
    double balance;
    void deposit(double amount)
    {
        balance=balance+amount;
    }
    void withdraw(double amount)
    {
        if(amount<=balance)
            balance=balance-amount;
        else
            System.out.println("Insufficient balance");
    }
    void checkBalance()
    {
        System.out.println("Account holder:"+account_holder_name);
        System.out.println("Balance:"+balance);
    }
    public static void main(String[] args)
    {
        BankAccount b=new BankAccount();
        b.account_holder_name="Anu";
        b.balance=500;
        b.deposit(2000);
        b.withdraw(1000);
        b.checkBalance();
    }

}
