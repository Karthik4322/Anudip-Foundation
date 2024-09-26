package student;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.io.*;

public class StudentDetails{

String name;
double id;
String schoolName;
int standardOfStudying;
String dob;

public void getInput(){

SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
Scanner sc = new Scanner(System.in);

System.out.println("Enter the StudentID : " );
id = sc.nextDouble();
sc.nextLine();
System.out.println("Enter the name : " );
name = sc.nextLine();
System.out.println("Enter the school name : " );
schoolName = sc.nextLine();
System.out.println("Enter the standard of studying : " );
standardOfStudying = sc.nextInt();
sc.nextLine();
System.out.println("Enter the Date of birth in the format of dd/mm/yy : " );
dob =sc.nextLine();
System.out.println("---------Student details-------");


try{
 Date date = sdf.parse(dob);
 System.out.println("Date of birth : "+sdf.format(date));
}
catch(ParseException e)
{
System.out.println("Invalid date format ");
}
}
public void display(){
 System.out.println("Student ID : "+id);
 System.out.println("Name : "+name);
 System.out.println("School Name : "+schoolName);
 System.out.println("Standard of Studying : "+standardOfStudying);
 System.out.println("---------------------------------------------------");

}
}









