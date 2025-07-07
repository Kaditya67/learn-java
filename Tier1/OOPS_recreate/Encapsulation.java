package Tier1.OOPS_recreate;

class Student {
    private String name;   // private = data hiding
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 20);

        // Accessing via getter
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        // Modifying via setter
        s1.setName("Kaditya");
        s1.setAge(22);

        System.out.println("Updated Name: " + s1.getName());
        System.out.println("Updated Age: " + s1.getAge());
    }
}
