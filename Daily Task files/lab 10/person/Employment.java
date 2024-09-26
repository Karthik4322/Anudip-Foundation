package person;
import java.util.Scanner;

public class Employment{

String designation;
double salary;
String companyName;
int workExperience;
int empID;

public void getInput(){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the employee id : " );
empID = sc.nextInt();
sc.nextLine();
System.out.println("Enter the designation : " );
designation = sc.nextLine();
System.out.println("Enter the company name : " );
companyName = sc.nextLine();
System.out.println("Enter the work experience : " );
workExperience = sc.nextInt();
sc.nextLine();
System.out.println("Enter the salary : " );
salary = sc.nextDouble();
System.out.println("--------------------------------------------------");
}
public void display(){

System.out.println("Employee Id : "+empID);

System.out.println("Designation : "+designation);

System.out.println("Company Name : "+companyName);

System.out.println("Work Experience : "+workExperience);

System.out.println("Salary : "+salary);

System.out.println("--------------------------------------------------");


}
}






