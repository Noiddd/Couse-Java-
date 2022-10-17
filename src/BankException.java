import java.util.Scanner;

class InvalidAccountException extends Exception {
    public String getMessage() {
        return "Invalid account number";
    }
}

class InvalidPasswordException extends Exception {
    public String getMessage() {
        return "Invalid password";
    }
}

class ATM {
    int accountNumber;
    int password;
    int an;
    int pw;

    void acceptInput(int accountNumber, int password) {
        this.accountNumber = accountNumber;
        this.password = password;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account number");
        an = scan.nextInt();

        System.out.println("Enter password");
        pw = scan.nextInt();
    }

    void verify() throws InvalidAccountException, InvalidPasswordException  {
        if(accountNumber != an) {
            InvalidAccountException iane = new InvalidAccountException();
            System.out.println(iane.getMessage());
            throw iane;
        } else if(password != pw) {
            InvalidPasswordException ipe = new InvalidPasswordException();
            System.out.println(ipe.getMessage());
            throw ipe;
        } else {
            System.out.println("Proceed");
        }
    }

    void cardBlock() {
        System.out.println("Card Block");
    }


}

class Bank {
    int accountNumber  = 1234;
    int password = 1111;
    void initiate() {
        ATM atm = new ATM();
        try {
            atm.acceptInput(accountNumber, password);
            atm.verify();
        } catch(InvalidAccountException iane) {
            System.out.println(iane.getMessage() + " in initiate method in Bank class");
        } catch(InvalidPasswordException ipe) {
            System.out.println(ipe.getMessage() + " in initiate method in Bank class");
        }
    }
}

public class BankException {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initiate();
    }
}
