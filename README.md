# 🚀 Java OOPs Concepts

A complete collection of **Object-Oriented Programming (OOPs)** examples implemented in **Java**.  
This repository covers all the core pillars of OOPs — Encapsulation, Inheritance, Polymorphism, and Abstraction — along with real-world examples.

---

## 🧠 Concepts Covered

| Concept | Description | Example File |
|----------|--------------|---------------|
| **Encapsulation** | Hiding internal data using private variables and public getters/setters. | `Encapsulation/BankAccount.java` |
| **Inheritance** | Acquiring properties and behaviors from parent classes. | `Inheritance/VehicleExample.java` |
| **Polymorphism** | Same method behaves differently for different objects. | `Polymorphism/ShapeExample.java` |
| **Abstraction** | Hiding internal implementation and showing only essential features. | `Abstraction/Abstraction2.java` |
| **Interface** | Achieving abstraction through interfaces. | `Interfaces/ElectricVehicle.java` |

---

## 🧩 Code Example (Abstraction)

```java
abstract class Vehicle {
    abstract void start();
    abstract void stop();

    void fuelType() {
        System.out.println("Most vehicles use fuel or electricity.");
    }
}

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

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.fuelType();
        car.stop();
    }
}
