//Define a method calculateAverage that calculates and returns the average value of elements in an integer array. Ensure the array is passed by reference

public class Average{

    // Method to calculate the average value of elements in an integer array
    public static double calculateAverage(int[] array) {

        // Check if the array is empty to avoid division by zero

        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int sum = 0;	 // Calculate the sum of elements in the array
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;  // Calculate and return the average
    }

    public static void main(String[] args) {
 
        int[] numbers = {10, 20, 30, 40, 50};     // Example array
        double average = calculateAverage(numbers);   // Calculate the average     
        System.out.println("The average is: " + average); // Display the average
    }
}
