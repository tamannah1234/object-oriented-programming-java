package OOPS;
// Abstract class - blueprint
abstract class Vehicle {
    abstract void start();  // Abstract method (no body)      No implemnetation but declare method must be there in class
    abstract void stop();   // Abstract method

    void fuelType() {       // Concrete method
        System.out.println("Most vehicles use fuel or electricity.");
    }
}

// Child class 1
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or button.");
    }

    @Override
    void stop() {
        System.out.println("Car stops with brakes.");
    }
}

// Child class 2
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or self start.");
    }

    @Override
    void stop() {
        System.out.println("Bike stops with hand and foot brakes.");
    }
}


public class Abstraction2 {
         public static void main(String[] args) {
        Vehicle car = new Car();             //Vehicle obj cannot be instatiated boz of that child class is instatntiate
        car.start();
        car.fuelType();
        car.stop();

        System.out.println("----------------------");

        Vehicle bike = new Bike();
        bike.start();
       bike.fuelType();
        bike.stop();
    }
    
}
