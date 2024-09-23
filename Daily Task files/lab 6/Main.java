// Define the BankAccount interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

// Implement the CheckingAccount class
class CheckingAccount implements BankAccount {
    private double balance;

    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1000.0);
        account.deposit(200.0);
        account.withdraw(150.0);
    }
}
