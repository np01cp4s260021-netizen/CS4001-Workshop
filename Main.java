class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void displayBalance() {
        System.out.println(holderName + " Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {


        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

     
        b1.accountNumber = 1;
        b1.holderName = "Arshiya";
        b1.balance = 1000;

        b2.accountNumber = 2;
        b2.holderName = "Arnav";
        b2.balance = 2000;

      
        b1.deposit(500);
        b1.withdraw(200);

        b2.deposit(300);
        b2.withdraw(100);

      
        b1.displayBalance();
        b2.displayBalance();
    }
}
//workshop7