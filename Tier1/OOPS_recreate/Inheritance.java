package Tier1.OOPS_recreate;

// Base class
class Vehicle {
    String brand = "Generic Vehicle";

    void start() {
        System.out.println(brand + " starting...");
    }
}

// Derived class (Single Inheritance)
class Car extends Vehicle {
    int wheels = 4;

    void drive() {
        System.out.println("Car driving on " + wheels + " wheels");
    }
}

// Derived class (Multilevel Inheritance)
class SportsCar extends Car {
    String mode = "Turbo";

    void boost() {
        System.out.println("SportsCar boosting in " + mode + " mode!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();

        // Inherited from Vehicle
        sc.start();

        // Inherited from Car
        sc.drive();

        // SportsCar own method
        sc.boost();
    }
}
