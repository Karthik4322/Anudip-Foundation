class Animal{

 void sound(){
	
System.out.println("Sound");

}
}

class Dog extends Animal{

 void sound(){

System.out.println("Barking Barking");

}
}
class Cat extends Animal{

 void sound(){

System.out.println("Meow Meow");

}
}

class Override{
public static void main(String args[]){

Dog d = new Dog();
Cat c = new Cat();

//System.out.prinln(+d.sound());   if you assigned values in void type it will not allowed to print like this and return type are allowed
//System.out.println(+c.sound());
d.sound();
c.sound();
}
}

	