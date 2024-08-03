/*Write a Java program to replace the second element of an ArrayList with the specified element*/

import java.util.*; // The package contains the one of container class like List,Queue,Set & Map.

class ReplaceElement{ // Name of java file

public static void main(String args[]){ // Main method where program initiates the process

List<String> a = new ArrayList<>(); // ArrayList is a child of parent List(I)

a.add(" Joey Tribbianni "); // Using add method , we are adding the elements in the list

a.add( " Monica Geller ");

a.add(" Chandler Bing ");

a.add(" Ross Geller ");

a.add(" Phoebe Buffay ");

a.add(" Rachel Green ");

System.out.println("The characters in the Friends Series: "+"\n"); 

for( String b : a){  // Using for each loop , we are printing the elements in the ArrayList a through String b

System.out.println(b);

}
a.set(2," Late Chandler Bing "); // By using set method we are replacing the element by giving the index value with replacing element

System.out.println("\n"+"The characters who are still alive: " +"\n");

for( String b : a){ 	// we are printing the elements in the ArrayList a through String b

System.out.println(b); 
}

}

}
