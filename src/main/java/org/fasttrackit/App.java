package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //one-line comment
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;


        Engine engine2 = new Engine();
        engine2.manufacturer = "VW";
        engine2.capacity = 1800;
        Car car = new Car(engine2);
        car.name = "Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";


        System.out.println(car.name);
        System.out.println(car.travelDistance);
        System.out.println(car.running);

        car.accelerate(60, 1);

        Car car2 = new Car(engine);
        car2.name = "Golf";
        car2.mileage = 6.5;
        car2.doorCount = 3;
        car2.maxSpeed = 160;
        car2.fuelLevel = 55;

//        car.name=null;
        //concatenare
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car1 name: " + car.name);

        car = car2;


        //citesc ce introduce user-ul
        System.out.println("Please enter some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Input from user: " + text);
    }
}
