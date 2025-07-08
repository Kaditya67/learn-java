// ConstructorDemo.java

class Student {
    String name;
    int age;

    // 🔹 1. Default Constructor (no-arg)
    Student() {
        System.out.println("Default constructor called");
        name = "Unknown";
        age = 0;
    }

    // 🔹 2. Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // 🔹 3. Constructor Overloading (different parameter types)
    Student(String name) {
        this.name = name;
        this.age = 18;  // default age
        System.out.println("Single-arg constructor called");
    }

    // 🔹 4. Constructor Chaining using this()
    Student(int age) {
        this("DefaultName", age); // calls 2-arg constructor
        System.out.println("Constructor chaining done");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("== Default Constructor ==");
        Student s1 = new Student();
        s1.display();

        System.out.println("\n== Parameterized Constructor ==");
        Student s2 = new Student("Aditya", 21);
        s2.display();

        System.out.println("\n== Overloaded Constructor (Single Arg) ==");
        Student s3 = new Student("Riya");
        s3.display();

        System.out.println("\n== Constructor Chaining ==");
        Student s4 = new Student(25);
        s4.display();
    }
}
