package Tier1.OOPS_recreate;

// Compile-time Polymorphism
class Calculator {

    // Same method name, different params
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));          // int
        System.out.println(calc.add(3.5, 4.5));      // double
        System.out.println(calc.add(1, 2, 3));       // 3 ints
    }
}
