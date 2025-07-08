// SuperKeywordDemo.java

class Person {
    String role = "Human";

    Person() {
        System.out.println("Person constructor called");
    }

    void showRole() {
        System.out.println("Role from parent: " + role);
    }

    void greet() {
        System.out.println("Hello from Person");
    }
}

class Employee extends Person {
    String role = "Engineer";

    Employee() {
        super();  // Calls parent constructor (must be 1st statement)
        System.out.println("Employee constructor called");
    }

    void showRole() {
        System.out.println("Role from child: " + role);
        System.out.println("Role from parent using super: " + super.role);
    }

    void greet() {
        super.greet(); // Call parent class method
        System.out.println("Hello from Employee");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println();
        emp.showRole();

        System.out.println();
        emp.greet();
    }
}
