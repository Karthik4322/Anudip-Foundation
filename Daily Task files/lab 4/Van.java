/* 2.Creating few classes like Vehicle, Speed. A Van class is defined which extends Vehicle class and has a Speed class object. Van class inherits properties from Vehicle class and Speed being its property, we're passing it from caller object. In output, we're printing the details of Van object.(Aggregation) */

class Vehicle{

String vehicle_types[] = { "Van" , "Jeep" , "SUV" , "HatchBack"};

void typesofvehicle(){
	for(String types : vehicle_types)
{
	System.out.println("Cateory of vehicles are : ");
	System.out.println(types);
}
}
}
class Speed extends Vehicle
{
int van_spdl = 130;
int sportz_spdl = 280 ;
int jeep_spdl = 250;
int suv_spdl = 150;
int hatch_spdl = 140;
 
void van_speedlevel(){
	System.out.println("Speed of the vehicle is : "+van_spdl);

}
void sportz_speedlevel(){
	System.out.println("Speed of the vehicle is : "+sportz_spdl);

}
}

public class Van extends Speed{

String color = "black";
int no_of_wheels = 4;
String model_name = "Maruti wagnor ";


public static void main(String args[]){
Van v1 = new Van();

v1.van_speedlevel();
v1.typesofvehicle();
System.out.println("Color of vehicle is : " +v1.color);
System.out.println("No of wheels in the vehicle is : " +v1.no_of_wheels);
System.out.println("Model of vehicle is : " +v1.model_name);

}
}

