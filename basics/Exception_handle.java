import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception_handle{
    public static void main(String[] args) {
        int num=0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){  // This resources will be freed as soon as it goes out of scope
            System.out.print("Enter a number to Divide 10 : ");
            num = Integer.parseInt(br.readLine());

            int a = 10;
            int c = a / num;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled : " + e);
        } catch (Exception e) {
            System.out.println("Exception handled : " + e);
        }

        // try {
        //     int a = 10;
        //     int c = a / b;
        // } catch (ArithmeticException e) {
        //     System.out.println("ArithmeticException handled : " + e);
        // }
        // catch (Exception e) {
        //     System.out.println("Exception handled");
        // }
    }
}