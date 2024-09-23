//A parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2 I have passed two arguments so that this constructor gets invoked //after creation of obj1 and obj2.

public class Para{
    int ID;
    String Name;
       
Para(int id , String n){
   this.ID = id;
   this.Name = n;
}
public void display(){
	System.out.println("ID : "+ID);
	System.out.println("Name :"+Name);

   }
public static void main(String args[]){
Para obj1 = new Para(007,"Karthik");
Para obj2 = new Para(005,"Vikram");
obj1.display();
obj2.display();
        
    }
}