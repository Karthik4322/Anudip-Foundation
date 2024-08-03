// Write a  java program for Exception Handling using throw keyword

public class MultipleExceptions {

    public static void getExceptions() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int a = 20;
        int b = 0;
        int arr[] = new int[2];

        // This will cause ArithmeticException
        b = a / b;

        // This will cause ArrayIndexOutOfBoundsException
        System.out.println("The value at index 3 is :" + arr[2]);
    }
    public static void main(String args[]) {
        try {
            getExceptions(); // In try section is used to have exception statements
        } 
        catch (ArithmeticException e) { // In catch section used to return statement if valid arithmeticexception received from the try block
            System.out.println("An arithmetic problem occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException ae) { //In catch section used to return statement if valid arrayindexoutofboundsexception received from the try block

            System.out.println("An array index out of bounds problem occurred: " + ae.getMessage());
        }
        System.out.println("The program works fine");
    }
}
