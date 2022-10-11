import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        System.out.println("Connection established");

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the numerator");
            int a = scan.nextInt();

            System.out.println("Enter the denominator");
            int b = scan.nextInt();

            int c = a/b;
            System.out.println(c);

            System.out.println("Enter the size of an array");
            int size = scan.nextInt();
            int arr[] = new int[size];

            System.out.println("Enter the position at which element has to be inserted");
            int position = scan.nextInt();

            System.out.println("Enter the element to be inserted");
            int element = scan.nextInt();

            arr[position] = element;
            System.out.println(arr[position]);

        } catch(ArithmeticException e) {
            System.out.println("Enter a non-zero denominator");
        } catch(NegativeArraySizeException e) {
            System.out.println("Be positive");
        }
        catch(InputMismatchException e) {
            System.out.println("");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Position entered not possible");
        }

        System.out.println("Connection terminated");
    }
}
