class MotherLion{

String gender = "Female";
int age = 3;



void details(){
System.out.println("---------------------Details of MotherLion------------------");
System.out.println("Age: "+age);
System.out.println("Gender: "+gender);

}
void routine(){
System.out.println("Hunting ,Breeding,Feeding,Sleeping,Protecting,Trainer...");
}
void sleep(){
System.out.println("Sleeping");
}
void climb(){
System.out.println("climbing");
}
void hunt(){
System.out.println("hunting");
}
void feed(){
System.out.println("feeding");
}
void eat(){
System.out.println("eating");
}
}

class Baby1 extends MotherLion{
int months = 1;
String gender="Male";


void details(){
System.out.println("---------------------Details of Baby1------------------");

System.out.println("Months: "+months);
System.out.println("Gender: "+gender);


}

void cry(){
System.out.println("crying...");
}

void play(){
System.out.println("playing...");
}

void fight(){
System.out.println("fight with siblings ");
}

void routine(){
System.out.println("Sleeping,Playing,Eating,Crying");
}
}

class Baby2 extends MotherLion{
int months = 5;
String gender="Female";

void details(){
System.out.println("---------------------Details of Baby2------------------");

System.out.println("Months: "+months);
System.out.println("Gender: "+gender);

}

void fight(){
System.out.println("fight with siblings ");
}

void routine(){
System.out.println("Sleeping,Playing,Eating,Crying,Learning");
}
}

public class Lions{
public static void main(String args[]){

MotherLion ml = new MotherLion();


ml.details();
ml.routine();

Baby1 b1 = new Baby1();


b1.details();
b1.routine();
b1.cry();
b1.play();
b1.fight();
b1.eat();
b1.climb();

Baby2 b2 = new Baby2();

b2.details();
b2.routine();
b2.fight();
b2.eat();
b2.climb();

}
}






 



