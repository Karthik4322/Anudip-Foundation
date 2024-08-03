import java.util.*; // package which contains ArrayList

class Student{

String name; // fields for Student class objects

int ID;

Student(String n, int id){ // constructor to assign value to fields

this.name =  n;

this.ID = id;

}

public String getName() { // Getter method for Id

        return name;
    }

    
public int getID() {  // Getter for the ID

        return ID;
    }

}

class Main{ // name of program file

public static void main(String args[]){ // main method to initiate the process

ArrayList<Student> sdetails = new ArrayList<Student>(); // Collections ArrayList

sdetails.add(new Student("Karthik",4848)); // adding data to list using 10 different objects

sdetails.add(new Student("Sam Praveen",4823));

sdetails.add(new Student("DhinaKaran",4321));

sdetails.add(new Student("SivaSankaran",5667));

sdetails.add(new Student("Suman Raj",7888));

sdetails.add(new Student("Tamil Selvan",4838));

sdetails.add(new Student("Selvendran",5555));

sdetails.add(new Student("Vinitha",4333));

sdetails.add(new Student("Reshma",9392));

sdetails.add(new Student("Venilla",9230));


for(Student data : sdetails){ // for each to allocate to execute those 10 values 

System.out.println("ID: "+data.getID()+" "+"Name: "+data.getName());

}
}
}

