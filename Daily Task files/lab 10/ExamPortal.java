import student.*;
import java.util.Scanner;

public class ExamPortal{
public static void main(String args[]){

StudentDetails sd = new StudentDetails();
Mark m = new Mark();
Result r = new Result();

sd.getInput();
sd.display();
m.getInput();
m.display();

 r.language = m.language;
 r.english = m.english;
 r.mathematics = m.mathematics;
 r.science = m.science;
 r.socialScience = m.socialScience;

r.calculateTotal();
r.percentage();

}
}
