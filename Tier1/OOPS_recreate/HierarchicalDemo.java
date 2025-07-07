package Tier1.OOPS_recreate;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car...");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Riding a bike...");
    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.start();    // inherited
        myCar.drive();    // own

        myBike.start();   // inherited
        myBike.ride();    // own
    }
}
