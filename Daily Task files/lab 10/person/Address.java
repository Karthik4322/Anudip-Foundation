package person;
import java.util.Scanner;

public class Address{

String doorNo;
String streetName;
String locality;
String city;
String pincode;
String state;
String country;

public void getInput(){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the door no : ");
doorNo = sc.nextLine();
System.out.println("Enter the street name : ");
streetName = sc.nextLine();
System.out.println("Enter the locality : ");
locality = sc.nextLine();
System.out.println("Enter the city name : ");
city = sc.nextLine();
System.out.println("Enter the pincode : ");
pincode = sc.nextLine();
System.out.println("Enter the state name  : ");
state = sc.nextLine();
System.out.println("Enter the country: ");
country = sc.nextLine();
System.out.println("--------------------------------------------------");
}
public void display(){

System.out.println("Door No : "+doorNo);

System.out.println("Street Name : "+streetName);

System.out.println("Locality : "+locality);

System.out.println("City : "+city);

System.out.println("Pincode : "+pincode);

System.out.println("State : "+state);

System.out.println("Country : "+country);

System.out.println("--------------------------------------------------");

}
}
