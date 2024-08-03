// Write a program using exception handling to handle array index out of bounds, Arithmetic exception

class ThrowExample{
    int age;
   static void validateAge(int age){ // static method to call method without objectname
        if(age<18)
        throw new ArithmeticException("Not valid"); // if throw exception is happened , it doesn't allow remaining program to execute
        else
        System.out.println("He/she is allowed to vote");
    }
    public static void main(String[] args) {
        validateAge(22);  // passing the value to parameter int age in method named validateAge
        System.out.println("command reader");
    }
}
