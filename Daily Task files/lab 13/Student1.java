// Write a method findStudentByName that searches for a Student object by name within the array. 
// Return the index of the object if found, or -1 if not found.

class Student1{
    private String name;
    private int age;
    private char grade;

    // Constructor to initialize the data members
    public Student1(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Method to display the student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    // Method to find a student by name and return the index
    public static int findStudentByName(Student1[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return i;
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        // Declare an array of 5 Student objects and initialize them
        Student1[] students = {
            new Student1("Alexander", 20, 'A'),
            new Student1("Babu", 21, 'B'),
            new Student1("Charles", 22, 'A'),
            new Student1("Dhanush", 23, 'C'),
            new Student1("Eswar", 20, 'B')
        };

        // Example usage of findStudentByName
        String searchName = "Charles";
        int index = findStudentByName(students, searchName);
        
        if (index != -1) {
            System.out.println(searchName + " found at index " + index);
        } else {
            System.out.println(searchName + " not found");
        }
    }
}
