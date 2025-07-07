package Tier1.OOPS_recreate;

interface Flyable {
    void fly();      // implicitly public + abstract
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying high!");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is flying in the sky!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable f;

        f = new Bird();
        f.fly();

        f = new Airplane();
        f.fly();
    }
}
