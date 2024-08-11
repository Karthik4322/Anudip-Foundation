/*1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle
 that implement the Shape interface. Implement the getArea() method for each of the three classes. */


interface Shape{
 public void getArea();
}
class Rectangle implements Shape{

double Area;
double length;
double breadth;


Rectangle(double l, double b){

this.length = l;
this.breadth = b;

}
public void getArea(){
	Area = length * breadth;
	System.out.println("The Area of Rectangle : "+Area);
}
}
class Circle implements Shape{

double Area;
double r;

Circle(double radius){

this.r = radius;

}

public void getArea(){
	Area = 3.14 * r * r;
	System.out.println("The Area of Circle : "+Area);
}
}
class Triangle implements Shape{
double Area;
double breadth;
double height;

Triangle(int b, int h){

this.breadth = b;
this.height = h;
}

public void getArea(){

Area = 0.5 * breadth * height;

System.out.println("The Area of Triangle : "+Area);
}
}
class AreaOfShapes{
public static void main(String args[]){
	Rectangle r1 = new Rectangle(3,5);
	r1.getArea();

	Circle c1 = new Circle(5);
	c1.getArea();

	Triangle t1 = new Triangle(5,5);
	t1.getArea();
}
}
	


