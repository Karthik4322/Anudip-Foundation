import java.util.*;

class Student{

String name;
int ID;

Student(String name, int id){
this.name =  name;
this.ID = id;
}
}
class Main{
public static void main(String args[]){
ArrayList<Student> sdetails = new ArrayList<Student>();
sdetails.add(new Student("Karthik",4848));
sdetails.add(new Student("Sam Praveen",4823));
sdetails.add(new Student("DhinaKaran",4321));
sdetails.add(new Student("SivaSankaran",5667));
sdetails.add(new Student("Suman Raj",7888));
sdetails.add(new Student("Tamil Selvan",4838));
sdetails.add(new Student("Selvendran",5555));
sdetails.add(new Student("Vinitha",4333));
sdetails.add(new Student("Reshma",9392));
sdetails.add(new Student("Venilla",9230));

for(Object dataOfStudent : sdetails){
System.out.println("ID: "+ID+" "+"Name: "+name);
}
}
}

