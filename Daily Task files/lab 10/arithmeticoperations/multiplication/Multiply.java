package multiplication;

import java.io.*;
public class Multiply
{
int a,b,c;
DataInputStream dis = new DataInputStream(System.in);
public void multiply() throws IOException
{
System.out.println("MULTIPLICATION");
System.out.println("Enter the value of A : ");
a = Integer.parseInt(dis.readLine());
System.out.println("Enter the value of B : ");
b = Integer.parseInt(dis.readLine());
c= a*b;
System.out.println(a+" * "+b+" = "+c);
}
