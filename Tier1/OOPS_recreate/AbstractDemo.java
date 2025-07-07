package Tier1.OOPS_recreate;

abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area();   // Abstract method

    void display() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s = new Circle("Red", 5.0);

        s.display();                      // From abstract class
        System.out.println(s.area());     // From Circle class
    }
}
