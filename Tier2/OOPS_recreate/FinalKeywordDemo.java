// FinalKeywordDemo.java

// 🔹 final class → cannot be extended
final class Constants {
    // final variable → constant, must be initialized once
    final double PI = 3.14159;

    // final method → can't be overridden
    final void display() {
        System.out.println("Inside final class. PI = " + PI);
    }

    // Uncommenting this constructor would allow you to assign PI once
    // Constants(double pi) {
    //     this.PI = pi;
    // }
}

// 🔸 Trying to extend a final class — not allowed
// class ExtendedConstants extends Constants {} ❌ COMPILE ERROR
// Main.java

class Parent {
    final void show() {
        System.out.println("Final method in parent class.");
    }
}

class Child extends Parent {
    // void show() {} ❌ Compile-time Error — cannot override final method
    void childMethod() {
        System.out.println("Child method executing.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // 🔹 final variable usage
        final int maxSpeed = 120;
        // maxSpeed = 150; ❌ Cannot reassign

        System.out.println("Max speed limit: " + maxSpeed);

        // 🔹 final class usage
        Constants c = new Constants();
        c.display();

        // 🔹 final method demo
        Child ch = new Child();
        ch.show();
        ch.childMethod();
    }
}
