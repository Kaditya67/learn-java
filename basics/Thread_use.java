// class A extends Thread{
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }

// class B implements Runnable{
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }

class A implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread A is running");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread B is running");
        }
    }
}

public class Thread_use {
    public static void main(String[] args) {
        // Runnable obj1 = new A(); 
        // Runnable obj2 = new B();

        // Implementing Runnable interface using anonymous class

        // Runnable obj1 = new Runnable() {
        //     public void run(){
        //         for(int i=0;i<100;i++){
        //             System.out.println("Thread A is running");
        //         }
        //     }
        // };

        // Runnable obj2 = new Runnable() {
        //     public void run(){
        //         for(int i=0;i<100;i++){
        //             System.out.println("Thread B is running");
        //         }
        //     }
        // };

        // Implementing Runnable interface using lambda expression

        Runnable obj1 = () -> {
            for(int i=0;i<100;i++){
                System.out.println("Thread A is running");
            }
        };

        Runnable obj2 = () -> {
            for(int i=0;i<100;i++){
                System.out.println("Thread B is running");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();     // calls run method
        t2.start();     // calls run method
    }
}
