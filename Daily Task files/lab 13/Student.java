// Write code to declare an array of objects of a class Student with a size of 5 Initialize 
// each object in the array with relevant data (name, age, grade) using a constructor

class Student {
    private String name;
    private int age;
    private char grade;

    // Constructor to initialize the data members
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display the student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        // Declare an array of 5 Student objects and initialize them
        Student[] students = {
            new Student("Alexander", 20, 'A'),
            new Student("Babu", 21, 'B'),
            new Student("Charles", 22, 'A'),
            new Student("Dhanush", 23, 'C'),
            new Student("Eswar", 20, 'B')
        };

        // Display the details of each student
        for (Student student : students) {
            student.display();
        }
    }
}
