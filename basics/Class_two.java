// class Computer {
//     void code() {
//         System.out.println("coding...Computer");
//     }
// }

// abstract class Computer {
//     abstract void code();
// }

interface Computer {
    void code();
}

class Desktop implements Computer {
    public void code() {
        System.out.println("coding...Desktop");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("coding...Laptop");
    }
}

class DevApp {
    void code(Computer l) {
        l.code();
    }
}

public class Class_two {
    public static void main(String[] args) { 
        Computer d1 = new Desktop();

        Computer l1 = new Laptop();

        DevApp d = new DevApp();
        d.code(d1); // <-- Calls DevApp's code(Computer) method
    }
}
