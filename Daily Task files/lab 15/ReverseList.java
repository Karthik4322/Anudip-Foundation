/* Write a Java program to iterate a linked list in reverse order. */

import java.util.*; // The package contains the one of container class like List,Queue,Set & Map.

class ReverseList{ // name of java file

public static void main(String args[]){ // main method where program starts to execute

List<Integer> a = new LinkedList<>((Arrays.asList(34,54,78,71,582))); // elements assigned to object a 

Iterator<Integer> itr = a.iterator(); // iterator to print elements

System.out.print("  "+"The elements present in the list at Original format : "+"  ");

while(itr.hasNext()){ // hasNext to check elements present in list one after other

System.out.print(itr.next()+"  "); 

}

Collections.reverse(a); // Collections contains some static methods like reverse, sort and those operation made changes in object a 

Iterator<Integer> itr1 = a.iterator(); // iterator to print elements

System.out.print("\n"+"  "+"The elements present in the list at Reverse Order format : "+"  ");

while(itr1.hasNext()){  // to print elements after reversing the elements

System.out.print(itr1.next()+"  ");

}

}

}

