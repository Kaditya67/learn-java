package Tier1.OOPS_recreate;

class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Driving the car...");
    }

    void brake() {
        System.out.println("Braking...");
    }
}

public class Basic_oops {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Assign values
        myCar.color = "Red";
        myCar.speed = 120;

        // Access attributes
        System.out.println("Car color: " + myCar.color);
        System.out.println("Car speed: " + myCar.speed + " km/h");

        // Call methods
        myCar.drive();
        myCar.brake();
    }
}
