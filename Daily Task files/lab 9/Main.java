/*3. To write a Java program to EMP salary details using interface.*/

interface Salary{

public void getSalaryDetails();

}

class Employee implements Salary{

int empID;
String empName;
String designation;
int salary = 0;
int experience = 0;

void getValues( int id, int exp, String name, String des){
 empID = id;
 //salary = sal;
 experience = exp;
 empName = name;
 designation = des;
 
switch(designation){

case "Java Developer":
	salary = 70000;
	break;
case "Cloud Developer":
	salary = 90000;
	break;
case "Web Developer":
	salary = 70000;
	break;
case "Data Scientist":
	salary = 80000;
	break;
default:
	salary = 20000;
	break;
}
}
void experience(){

salary += 10000 * experience;

}

public void getSalaryDetails(){

	System.out.println( "Employee ID : "+empID+", Employee Name : "+empName+", Designation : "+designation+", Salary : "+salary);


}
}

class Main{
public static void main(String args[]){

Employee e = new Employee();
e.getValues( 310, 2, "Karthik", "Java Developer");
//e.salaryOnRoleBasis();
e.experience();
e.getSalaryDetails();


}
}





