package division;
import java.io.*;
public class Div
{
int a,b,c;
DataInputStream dis = new DataInputStream(System.in);
public void divide() throws IOException
{
System.out.println("Division");
System.out.println("Enter the value of A : ");
a = Integer.parseInt(dis.readLine());
System.out.println("Enter the value of B : ");
b = Integer.parseInt(dis.readLine());
c= a/b;
System.out.println(a+" / "+b+" = "+c);
}