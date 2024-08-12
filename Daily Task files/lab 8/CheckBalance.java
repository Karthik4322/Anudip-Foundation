/* Create an abstract class called "BankAccount"  with attributes such as account number and balance, and abstract methods called "deposit" and "withdraw".Create a subclass called "CheckingAccount" that    inherits from BankAccount and implements the  "deposit" and "withdraw" methods. Create an object  of the CheckingAccount class and call both the "deposit" and "withdraw" methods.*/


import java.util.Scanner;

abstract class BankAccount {
    double accountNumber;
    double balance;

    abstract void deposit();
    abstract void withdraw();
}

class CheckingAccount extends BankAccount {
    double d_amount;
    double w_amount;
    Scanner sc = new Scanner(System.in);

    void deposit() {
        System.out.println("Enter the Account No : ");
        accountNumber = sc.nextDouble();
        System.out.println("Enter the amount to be deposited: ");
        d_amount = sc.nextDouble();
        balance += d_amount; // Correct the balance update
        System.out.println("The deposit amount: " + d_amount + " updated balance: " + balance);
    }

    void withdraw() {
        System.out.println("Enter the Account No : ");
        accountNumber = sc.nextDouble();
        System.out.println("Enter the amount to be withdrawn: ");
        w_amount = sc.nextDouble();
        if (balance >= w_amount) {
            balance -= w_amount; // Correct the balance update
            System.out.println("The withdrawn amount: " + w_amount + " updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class CheckBalance {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount();
        ca.deposit();
        ca.withdraw();
    }
}
