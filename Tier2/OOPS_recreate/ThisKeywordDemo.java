// ThisKeywordDemo.java
class Student {
    String name;
    int roll;

    // Constructor using 'this' to resolve variable shadowing
    Student(String name, int roll) {
        this.name = name;     // 'this' refers to the instance variable
        this.roll = roll;
    }

    // Method using 'this' to call another method
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
        this.showMessage();   // Call another method using 'this'
    }

    void showMessage() {
        System.out.println("Student record displayed.");
    }

    // this can also be passed as an argument
    void callPrint(Student s) {
        System.out.println("Printing from callPrint: " + s.name);
    }

    void trigger() {
        callPrint(this); // passing current object
    }

    // this can be used to call another constructor (constructor chaining)
    Student() {
        this("Default Name", 0);
        System.out.println("Default constructor called using this()");
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Aditcya", 67);
        s1.display();

        System.out.println();

        Student s2 = new Student();
        s2.display();
        s2.trigger();
    }
}
