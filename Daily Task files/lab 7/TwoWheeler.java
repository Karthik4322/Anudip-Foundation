abstract class Bikes{  /* Runtime polymorphism using method overriding and deleting parent class method for not using by child class and declare parent class and method as abstract */

abstract void feature();
}
class ROneFive extends Bikes{
void feature(){
System.out.println("Stylist sporty bike at low price and average mileage ");
}
}

class Bullet extends Bikes{
void feature(){
System.out.println("Rigid Bike with unique sound");
}
}

class HeroSplender extends Bikes{
void feature(){
System.out.println("Best Milege two wheeler and lite weight to handle");
}
}
class TwoWheeler{
public static void main(String args[]){

ROneFive r15 = new ROneFive();
Bullet b     = new Bullet();
HeroSplender hs = new HeroSplender();

Bikes bik;

bik = r15;
bik.feature();





/*System.out.println("Feature of Bike R15 is : ");
r15.feature();

System.out.println("Feature of Bike Bullet is : ");
b.feature();

System.out.println("Feature of Bike HeroSplender is : ");
hs.feature();*/
}
}


