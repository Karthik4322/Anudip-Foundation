package student;
import java.util.Scanner;

public class Mark{
 public int language;
 public int english;
 public int mathematics;
 public int science;
 public int socialScience;

/*public Mark(int l, int e, int m, int s, int ss){
	this.language = l;
	this.english = e;
	this.mathematics = m;
	this.science = s;
	this.socialScience = ss;
}*/
public void getInput(){
	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the Language mark : ");
 	language = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the English mark : ");
 	english = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Mathematics mark : ");
 	mathematics = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Science mark : ");
 	science = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Social Science mark : ");
 	socialScience = sc.nextInt();
	sc.nextLine();

} 
public void display(){
	System.out.println("---------Mark details-------");
	System.out.println("Language : "+language);
	System.out.println("English : "+english);
	System.out.println("Mathematics : "+mathematics);
	System.out.println("Science : "+science);
	System.out.println("Social Science : "+socialScience);
	
}
}
 



