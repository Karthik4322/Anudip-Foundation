package student;

import java.util.Scanner;

public class Result{
int totalMark;
int scoredTotalMark;
int percentage;

public int language;
public int english;
public int mathematics;
public int science;
public int socialScience;

public void calculateTotal(){

Scanner sc = new Scanner(System.in);

System.out.println("---------Result details---------");
System.out.println("Enter the total mark of the examination : ");
totalMark = sc.nextInt();
scoredTotalMark = language + english + mathematics + science + socialScience;
System.out.println("The Overall mark scored by student is : "+scoredTotalMark+" / "+totalMark); 

}
public void percentage(){

percentage = (scoredTotalMark*100)/totalMark;
System.out.println("Percentage of student is : "+percentage);

}
}
