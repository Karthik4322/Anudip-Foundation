// Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]

import java.util.Arrays;   // make use of Arrays build in package
import java.util.Collections; // make use of Collections package to reverse order

class StringSortAZ{ 		// name of the class
				
public static void main(String args[]){  	// main method

String a[] = {"A","X","D","Z","Y","C","W","B"};  // array declaration

Arrays.sort(a);					// Using sort method from Arrays package	

Arrays.sort(a ,Collections.reverseOrder());	// Using reverse order method from Collections class 					  

System.out.println(Arrays.toString(a));  // Conversion of String type to String type

}
}




