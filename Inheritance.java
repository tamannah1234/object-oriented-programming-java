package OOPS;
// Parent class
class Vehicle {
    String brand;

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle has stopped.");
    }
}
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Two wheeler bike start with kick");
    }

    public void stop(){
        System.out.println("Stop with brake");
    }

    String milage = "100cc";
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int wheels = 4;

    public void openSunroof() {
        System.out.println("Sunroof is opening...");
    }

    // Overriding the start method
    @Override
    public void start() {
        System.out.println("Car engine starts with a key.");
    }
}

// Grandchild class (further inheritance)
class ElectricCar extends Car {
    int batteryLevel = 100;

    // Overriding the start method again
    @Override
    public void start() {
        System.out.println("Electric car starts silently using battery power.");
    }

    public void chargeBattery() {
        System.out.println("Battery is charging... Current level: " + batteryLevel + "%");
    }
}


public class Inheritance {

 public static void main(String[] args) {
        // Parent class object
        Vehicle v = new Vehicle();
        v.start();
        v.stop();
        System.out.println("----------------------");

        // Child class object
        Car c = new Car();
        c.brand = "Honda";
        System.out.println("Brand: " + c.brand);
        c.start();          // Overridden method
        c.openSunroof();
        c.stop();
        System.out.println("----------------------");

        // Grandchild class object
        ElectricCar e = new ElectricCar();
        e.brand = "Tesla";
        System.out.println("Brand: " + e.brand);
        e.start();          // Overridden method
        e.openSunroof();    // Inherited from Car
        e.chargeBattery();  // Own method
        e.stop();           // Inherited from Vehicle

        Bike b = new Bike();
        b.brand = " Honda Shine 356";
        System.out.println("Brand :" + b.brand);
        System.out.println("Bike milage is :  "+b.milage);
        b.start();
        b.stop();
    } 
}
