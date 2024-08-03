/*Write a Java program to sort a given array list.*/

import java.util.Arrays; // Given is contains the static method for Arrays only

public class ArraySorting { // Name of java file

    public static void main(String[] args) { // main method where program initiate the process

        int a[] = new int[]{34,66,40,123,59}; // primitive datatype array in variable and once the size of array fixed it can't be changed

        Arrays.sort(a); // Here Arrays is class , where build in methods are sort, fill, compare, deepEquals, equals , reverse etc..

        System.out.println("The elements in the sorted list"); 
        for(int b : a){	// for each method to print elements each time for each element

            System.out.print(b+"  ");

        }
    }
}
