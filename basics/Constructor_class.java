class Mobile {
    static String name;     // Static varible is common to all objects and can be accessed without creating objects
    private int price;
    private String brand;

    static {    // only once will be executed
        name = "Phone";
    }

    public Mobile() {
        price = 0;
        brand = "Not Specified";
    }
    public Mobile(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    void show() {
        System.out.println("Name: " + name + ", Price: " + price + ", Brand: " + brand);    
    }
}
public class Constructor_class {
    public static void main(String[] args) {
        Mobile m1  = new Mobile();     // default constructor will be called
        System.out.println(Mobile.name);
        m1.show();
        Mobile m2 = new Mobile(120000, "Apple");
        m2.show();
        System.out.println(Mobile.name);
    }
}
