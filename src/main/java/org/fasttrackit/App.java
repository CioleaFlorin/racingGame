package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        //one-line comment
        //Engine engine = new Engine();
        //engine.manufacturer = "Renault";
        //engine.capacity = 1600;
//
        //AutoVehicle autoVehicle=new AutoVehicle();
//
//
        //Engine engine2 = new Engine();
        //engine2.manufacturer = "VW";
        //engine2.capacity = 1800;
        //Car car = new Car(engine2);
        //car.setName("Dacia");
        //car.setFuelLevel(60);
        //car.setMileage(8.5);
        //car.doorCount = 5;
        //car.setMaxSpeed(180);
        //car.setFuelType("Gasoline");
//
        //System.out.println("Car object: " + car.toString());
//
        //System.out.println(car.getName());
        //System.out.println(car.getTravelDistance());
        //System.out.println(car.isRunning());
//
        //car.accelerate(60, 1);
//
        //Car car2 = new Car(engine);
        //car2.setName("Golf");
        //car2.setMileage(6.5);
        //car2.doorCount = 3;
        //car2.setMaxSpeed(160);
        //car2.setFuelLevel(55);
//
//      //  car.name=null;
        ////concatenare
        //System.out.println("Car2 name: " + car2.getName());
        //System.out.println("Car1 name: " + car.getName());
//
        //car = car2;
//
//
        ////citesc ce introduce user-ul
        //System.out.println("Please enter some text");
        //Scanner scanner = new Scanner(System.in);
        //String text = scanner.nextLine();
        //System.out.println("Input from user: " + text);


        //System.out.println("Static variables example: ");
        //we should only call static variables from the class itself(Car),
        // not from a variable containing an object of the class;
        // car.totalCount=1;
        //System.out.println("Total count in car: "+ car.totalCount);

        //car2.totalCount=12;

        //System.out.println("Total count in car after setting car2: "+ car.totalCount);

        //System.out.println("Total count in car2: "+ car2.totalCount);

        //System.out.println("Total count in Car class: "+ Car.totalCount);

        //Vehicle hybridCar=new HybridCar();
        //hybridCar.setName("cheater");
        //method implementation from object`s class not from variables`s class
        //hybridCar.accelerate(60,1);
        //System.out.println("Fuel level: " + hybridCar.getFuelLevel());

        //varialbe type decides what methods can be invoked
        //((HybridCar) hybridCar).fly();

        Game game=new Game();
        game.start();






    }
}
