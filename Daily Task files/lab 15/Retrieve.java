/*Write a Java program to retrieve, but not remove, the last element of a linked list.*/

import java.util.*; // The package contains the one of container class like List,Queue,Set & Map.


class Retrieve{  // Name of the class

	public static void main(String args[]){ // main method where initiate the process

List<String> l1 = new LinkedList<>(Arrays.asList("Karthik","Vimal","Aishu","Aaradhya"));// Wrapper class String on List with child LinkedList and l1 object holds the values

int sizeOfArray = l1.size();// method to find no of elements in the object l1

System.out.println("The Last element present in LinkedList is "+l1.get(sizeOfArray-1)); // get method to retrieve the element from the index value

//We can use either this method above method or below one

//System.out.println("The Last element present in LinkedList is "+l1.getLast());

}

}

