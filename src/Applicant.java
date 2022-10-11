import java.util.Scanner;

class TooOldException extends Exception{
    public String getMessage() {
        return "Not eligible, too old";
    }
}

class TooYoungException extends Exception{
    public String getMessage() {
        return "Not eligible, too young";
    }
}

class Verify {
    void acceptInput(int age) throws TooYoungException, TooOldException {
        if(age < 18) {
            TooYoungException tye = new TooYoungException();
            System.out.println(tye.getMessage());
            throw tye;
        } else if(age > 65) {
            TooOldException toe = new TooOldException();
            System.out.println(toe.getMessage());
            throw toe;
        }
    }

}


public class Applicant {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age");

        age = scan.nextInt();
        Verify test = new Verify();

        try {
            test.acceptInput(age);
        } catch(TooYoungException tye) {
            System.out.println(tye.getMessage() + " in main class");
        } catch(TooOldException toe) {
            System.out.println(toe.getMessage() + " in main class");
        }
    }
}
