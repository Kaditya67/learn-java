class Mobile {
    static String name;     // Static varible is common to all objects and can be accessed without creating objects
    int price;
    String brand;

    static {    // only once will be executed
        name = "Phone";
    }

    Mobile() {
        price = 12000;
        brand = "Xiaomi";
    }

    void show() {
        System.out.println("Name: " + name + ", Price: " + price + ", Brand: " + brand);    
    }
}

public class Class_one {
    public static void main(String[] args) {
        System.out.println(Mobile.name);
        Mobile m1  = new Mobile();
        m1.price = 12000;
        m1.brand = "Xiaomi";
        m1.show();

        Mobile m2 = new Mobile();
        m2.price = 120000;
        m2.brand = "Apple";
        m2.show();

        System.out.println(Mobile.name);
    }
}
