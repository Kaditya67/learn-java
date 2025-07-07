package Tier1.OOPS_recreate;

class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();     // Bark!

        a = new Cat();
        a.sound();     // Meow!
    }
}


// 🔥 Dynamic Method Dispatch:
// Method resolution happens at runtime, based on actual object type (Dog or Cat), not reference type (Animal).

// Java uses virtual method table (vtable) internally for this.