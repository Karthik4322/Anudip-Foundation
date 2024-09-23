public class BankCustomers{    //Constructor class
    int acno;		 	//datamembers of BankCustomers class
    String atype;
    double amt;
 
BankCustomers(int acknowledgemet_no,String acc_type,double bal_amount){  // Using parameterized constructor
  	this.acno = acknowledgemet_no;
	this.atype = acc_type;
	this.amt = bal_amount;
}

public void display(){				// Using void method to display the values passed through constructor
System.out.println(acno);
System.out.println(atype);
System.out.println(amt);
System.out.println(--------------------------------------);

}

    public static void main(String args[]){  // main method
        BankCustomers  user1 = new BankCustomers(1345456,"Savings",242534.465);  // creation of object 1
	BankCustomers  user2 = new BankCustomers(5675679,"Current",56454.5);	// creation of object 2

	user1.display();  // invoking display method  using object user 2 
	user2.display();  // invoking display method using object user 2 
     
    }
}