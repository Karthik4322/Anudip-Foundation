/*1. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. 
Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.*/

import java.util.Scanner;

class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
    int mileage;
    int speedMax;
    int totalKms;

    Scanner sc = new Scanner(System.in);

    void getValue() {
        System.out.println("Enter the make of vehicle : ");
        make = sc.nextLine();

        System.out.println("Enter the model of vehicle : ");
        model = sc.nextLine();

        System.out.println("Enter the fuel type of vehicle : ");
        fuelType = sc.nextLine();

        System.out.println("Enter the year of vehicle : ");
        year = sc.nextInt();
        sc.nextLine();  // consume the leftover newline character
    }

    void fuelEfficiency() {
        System.out.println("Enter the efficiency of vehicle : ");
        mileage = sc.nextInt();
        sc.nextLine();  // consume the leftover newline character
    }

    void distanceTravelled() {
        System.out.println("Enter the distance travelled of vehicle : ");
        totalKms = sc.nextInt();
        sc.nextLine();  // consume the leftover newline character
    }

    void maxSpeed() {
        System.out.println("Enter the maximum speed of vehicle : ");
        speedMax = sc.nextInt();
        sc.nextLine();  // consume the leftover newline character
    }

    void display() {
        System.out.println(make + " " + model + " " + year + " " + fuelType + " vehicle gives mileage of : " + mileage);
        System.out.println(model + " " + year + " " + fuelType + " vehicle gives overall distance covered now : " + totalKms);
        System.out.println(model + " " + year + " " + fuelType + " vehicle gives maximum speed of : " + speedMax);
    }
}

class Truck extends Vehicle {
    Truck() {
        System.out.println("------------------Enter the vehicle Truck details---------------");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("------------------Enter the vehicle Car details---------------");
    }
}

class MotorCycle extends Vehicle {
    MotorCycle() {
        System.out.println("------------------Enter the vehicle Motorcycle details---------------");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car tata = new Car();
        tata.getValue();
        tata.maxSpeed();
        tata.fuelEfficiency();
        tata.distanceTravelled();
        tata.display();

        Truck ashokleyland = new Truck();
        ashokleyland.getValue();
        ashokleyland.maxSpeed();
        ashokleyland.fuelEfficiency();
        ashokleyland.distanceTravelled();
        ashokleyland.display();

        MotorCycle R15 = new MotorCycle();
        R15.getValue();
        R15.maxSpeed();
        R15.fuelEfficiency();
        R15.distanceTravelled();
        R15.display();
    }
}
