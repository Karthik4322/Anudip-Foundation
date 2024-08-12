/*3. Create an interface called "Person" with a method called "speak". 
Create two classes  called "Student" and "Teacher" that implement  the Person interface and implement the "speak" method. 
Create objects of both the Student and  Teacher classes and call their respective "speak"  methods*/



interface Person {
    public abstract void speak();
}

class Student implements Person {
    public void speak() {
        System.out.println("The Students are speaking while class is going");
    }
}

class Teacher implements Person {
    public void speak() {
        System.out.println("The Teacher is speaking about topics discussed in previous classes");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        s.speak();
        t.speak();
    }
}
