class A{
    public A(){
        System.out.println("A class show()");
    }
}

class B{
    public B(){
        System.out.println("B class show()");
    }
}

class C extends A{
    public C(){
        super();
        System.out.println("C class show()");
    }
}
public class Extends_class {
    public static void main(String[] args) {
        C c = new C();
    }
}
