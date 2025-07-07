public class Switch {
    public static void main(String[] args) {
        int a = 1;
        // switch (a) {
        //     case 1:
        //         System.out.println("a is 1");
        //         break;
        //     case 2:
        //         System.out.println("a is 2");
        //         break;
        //     case 3:
        //         System.out.println("a is 3");
        //         break;
        //     default:
        //         System.out.println("a is not 1 or 2");
        // }

        switch (a) {
            case 1 -> System.out.println("a is 1");
            case 2 -> System.out.println("a is 2");
            case 3 -> System.out.println("a is 3");
            default -> System.out.println("a is not 1 or 2");
        }
    }
}
