import person.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
public static void main(String args[]){
PersonalDetails pd = new PersonalDetails();
Address a = new Address();
Employment e = new Employment();
pd.getInput();
pd.display();
a.getInput();
a.display();
e.getInput();
e.display();

}
}