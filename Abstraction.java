package OOPS;
//Abstraction means hiding implementation details and showing only the essential features of an object.
//Two ways to implement:abstract class and Interface
//An interface in Java is like a contract that defines what methods a class must implement, but not how they’re implemented.

// Interface (pure abstraction)
interface SmartDevice {
    void turnOn();   // abstract method
    void turnOff();  // abstract method
    void deviceInfo();

    // Default method (since Java 8)
    default void connectWifi() {
        System.out.println("Connecting to Wi-Fi network...");
    }

    // Static method (since Java 8)
    static void showCompany() {
        System.out.println("All smart devices are made by TechCorp.");
    }
}

// Class 1 implementing interface
class SmartTV implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart TV is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is now OFF.");
    }

    @Override
    public void deviceInfo() {
        System.out.println("Device: Samsung 4K Smart TV");
    }
}

// Class 2 implementing same interface
class SmartSpeaker implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Speaker is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Speaker is now OFF.");
    }

    @Override
    public void deviceInfo() {
        System.out.println("Device: Amazon Echo Dot");
    }
}



public class Abstraction {
    public static void main(String[] args) {
        // Access static method of interface
        SmartDevice.showCompany();

        System.out.println("----------------------");

        SmartDevice tv = new SmartTV();
        tv.turnOn();
        tv.deviceInfo();
        tv.connectWifi();  // default method
        tv.turnOff();

        System.out.println("----------------------");

        SmartDevice speaker = new SmartSpeaker();
        speaker.turnOn();
        speaker.deviceInfo();
        speaker.connectWifi();  // default method
        speaker.turnOff();
    } 
  }  

