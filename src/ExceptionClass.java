import java.util.Scanner;

class Exmp1 {
    void fun1() throws ArithmeticException {
        System.out.println("Connection2 established");

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the numerator");
            int a = scan.nextInt();

            System.out.println("Enter the denominator");
            int b = scan.nextInt();
            int c = a/b;
            System.out.println(c);
        } catch(ArithmeticException e) {
            System.out.println("Problem resolved in fun1");
            throw e;
        } finally {
            System.out.println("Connection2 terminated");
        }


    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        System.out.println("Connection1 established");

        try {
            Exmp1 e1 = new Exmp1();
            e1.fun1();
        } catch(ArithmeticException e) {
            System.out.println("Problem resolved in main");
        }

        System.out.println("Connection1 terminated");
    }
}
