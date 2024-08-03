// How to reverse a String in place in Java

import java.util.Scanner;
import java.lang.String;

public class ReverseString {
public static void main(String[] args) {
       
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter a string to reverse: ");
  String str = scanner.nextLine();
  StringBuffer sb = new StringBuffer();
  sb.append(str);
  sb.reverse();
  System.out.println("Reversed string: " + sb.toString());
  scanner.close();
    }
}
