/*Write a Java programming to create a banking system with three classes - BankAccount, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.*/

interface Accounts{

public void deposit();
public void withdraw();
public void calculateInterest();
public void viewBalance();

}

class BankAccount{

String typesOfAccount[] ={ "SavingsAccount" , "CurrentAccount", "SalaryAccount"};
Scanner sc = new Scanner(System.in);

void listAccount(){

System.out.println("The Available types of accounts in SBI Bank"+typesOfAccount);

}
void  addAccount(){

System.out.println("Enter the Account type to add new one : ");
typesOfAccount = sc.nextLine();
sc.nextLine();

}
}
class SavingsAccount implements Accounts{

double d_amount;
double balance = 0;
double accountNumber;
double w_amount;
double interest;
int interestRate;

public void deposit(){

System.out.println("Enter the account number : ");
accountNumber = sc.nextDouble();

System.out.println("Enter the amount to be deposited : "+d_amount);
d_amount = sc.nextDouble();

balance =+ d_amount;

System.out.println("Updated balance is : "+balance+" after deposits : "+d_amount);

}
public void withdraw(){


System.out.println("Enter the account number : ");
accountNumber = sc.nextDouble();

System.out.println("Enter the amount to be withdrawed : "+w_amount);
w_amount = sc.nextDouble();

balance =- w_amount;

System.out.println("Updated balance is : "+balance+" after withdraws : "+w_amount);

}
public void calculateInterest(){

System.out.println("Enter the interest rate of bank : ");
interestRate = sc.nextInt();

interest = interestRate * balance;

System.out.println("The interest amount for available balance per year is : "+interest);

}
public void viewBalance(){

System.out.println("Enter the account number : ");
accountNumber = sc.nextDouble();

System.out.println("Updated balance : "+balance);

}
}class CurrentAccount implements Accounts{

double d_amount;
double balance =0; 
double accountNumber;
double w_amount;
double interest;
int interestRate;

public void deposit(){

System.out.println("Enter the account number : ");
accountNumber = sc.nextDouble();

System.out.println("Enter the amount to be deposited : "+d_amount);
d_amount = sc.nextDouble();

balance =+ d_amount;

System.out.println("Updated balance is : "+balance+" after deposits : "+d_amount);

}
public void withdraw(){


System.out.println("Enter the account number : ");
accountNumber = sc.nextDouble();

System.out.println("Enter the amount to be withdrawed : "+w_amount);
w_amount = sc.nextDouble();

balance =- w_amount;

System.out.println("Updated balance is : "+balance+" after withdraws : "+w_amount);

}
public void calculateInterest(){

System.out.println("Enter the interest rate of bank : ");
interestRate = sc.nextInt();

interest = interestRate * balance;

System.out.println("The interest amount for available balance per year is : "+interest);

}
public void viewBalance(){

System.out.println("Enter the account number : ");
accountNumber = sc.nextDouble();

System.out.println("Updated balance : "+balance);

}
}
class RBI{
public static void main(String args[]){

SavingsAccount SA = new SavingsAccount();

SA.deposit();
SA.withdraw();
SA.calculateInterest();
SA.viewBalance();

CurrentAccount CA = new CurrentAccount();

}
}



















