class OuterStatic {
    static int outerData = 100;

    static class StaticNested {
        void display() {
            System.out.println("Inside static nested class");
            System.out.println("Outer data: " + outerData); // can access static members
        }
    }
}

class Outer {
    private String secret = "TopSecret";

    class Inner {
        void reveal() {
            System.out.println("Inner class accessing: " + secret);
        }
    }
}

abstract class Machine {
    abstract void run();
}

interface Action {
    void perform();
}

public class InnerClassesDemo {
    public static void main(String[] args) {
        // 🔹 Static Nested Class
        OuterStatic.StaticNested sn = new OuterStatic.StaticNested();
        sn.display();

        System.out.println();

        // 🔹 Non-static Inner Class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();  // needs outer instance
        inner.reveal();

        System.out.println();

        // 🔹 Anonymous Class (abstract)
        Machine m = new Machine() {
            void run() {
                System.out.println("Machine running anonymously!");
            }
        };
        m.run();

        System.out.println();

        // 🔹 Anonymous Class (interface)
        Action a = new Action() {
            public void perform() {
                System.out.println("Performing anonymous action...");
            }
        };
        a.perform();
    }
}
