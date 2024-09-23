class Animal{

String category[] = {"Cat", "Dog", "Lion" , "Tiger", "Elephant" };
String type[] = { "Omnivourous", "Herbivorous", "Aquatic"};
String food[] = { "Plant" , "Meat" };

void number_of_animals(){

for(String c : category){
System.out.println("Category of animals are : " );
System.out.println(c);

}
}

void eat(){
System.out.println("Eating...");
}

void run(){
System.out.println("Running ....");
}

void poop(){
System.out.println("pooping....");
}
}


class Dog extends Animal{

void bark(){
System.out.println("Bow Bow ....");
}

void handshake()
{
System.out.println("Hand Shake ....");
}

void roll(){
System.out.println("Rolling....");
}
}

public class SinglelevelInheritance{
public static void main(String args[]){

String color = "Brown";
String breed = "Bond Labrador";
int age = 2;

 Dog d1 = new Dog();
	d1.eat();
	d1.bark();
	d1.roll();
	d1.number_of_animals();

}
}
 