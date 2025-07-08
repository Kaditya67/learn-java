// StaticMembersDemo.java

class Counter {
    // 🔹 static variable shared by all objects
    static int count = 0;

    // instance variable
    int id;

    // constructor increments static count
    Counter() {
        count++;
        id = count;
        System.out.println("Object Created. ID: " + id);
    }

    // 🔹 static method to return total objects created
    static void printCount() {
        // System.out.println("ID: " + id); ❌ ERROR - can't access instance vars
        System.out.println("Total objects: " + count);
    }

    // 🔹 static block: runs once when class is loaded
    static {
        System.out.println("Static block executed: Class loaded.");
    }
}

// Main.java

public class StaticMembersDemo {
    public static void main(String[] args) {
        Counter.printCount(); // call static method without object

        System.out.println("\n== Creating Objects ==");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println();
        Counter.printCount(); // shared value for all
    }
}
