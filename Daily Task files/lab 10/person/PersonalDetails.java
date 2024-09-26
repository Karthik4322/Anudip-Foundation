package person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class PersonalDetails{

String name;
int age;
String dob;
String gender;
String placeOfLiving;

public void getInput(){

Scanner sc = new Scanner(System.in);


System.out.println("Enter a name of the person : " );
name = sc.nextLine();
System.out.println("Enter a age of the person : " );
age = sc.nextInt();
sc.nextLine();
System.out.println("Enter a gender of the person : " );
gender = sc.nextLine();
System.out.println("Enter a living place of the person : " );
placeOfLiving = sc.nextLine();
System.out.println("Enter Date of birth in this format (dd/mm/yy):");
dob = sc.nextLine();
SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
System.out.println("--------------------------------------------------");
try{
 Date date = myFormat.parse(dob);
 System.out.println("Date of Birth : "+myFormat.format(date));
}
catch(ParseException e){
	System.out.println("Invalid date format");
}
}
public void display(){

System.out.println("Name : "+name);

System.out.println("Age : "+age);

System.out.println("Gender : "+gender);

System.out.println("Place of Living : "+placeOfLiving);

System.out.println("--------------------------------------------------");


}
}









