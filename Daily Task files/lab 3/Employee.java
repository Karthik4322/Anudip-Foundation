public class Employee{
    int EmpId;
    String EmpName;
    int EmpSalary;
    int EmpAge;
    
Employee(int e_id,String e_name,int e_salary,int e_age){
	this.EmpId = e_id;
	this.EmpName = e_name;
	this.EmpSalary = e_salary;
	this.EmpAge = e_age;
}
public static void main(String args[]){
    Employee e1 = new Employee(123, "Karthik",50000,22);
    Employee e2 = new Employee(13, "Vikram",80000,21);

System.out.println(e1.EmpId);
System.out.println(e1.EmpName);
System.out.println(e1.EmpSalary);
System.out.println(e1.EmpAge);
System.out.println("-------------------------------------------------");

System.out.println(e2.EmpId);
System.out.println(e2.EmpName);
System.out.println(e2.EmpSalary);
System.out.println(e2.EmpAge);
}
}