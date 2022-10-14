package com.basic;

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

class Bank {
    int accountNumber  = 1234;
    int password = 1111;

}

class SubBranch {

}

class ATM extends SubBranch {
    int accountNumber;
    int password;
    int an;
    int pw;

    void initiate() {
        try {
            acceptInput(accountNumber, password);
            verify();
        } catch(InvalidAccountException iane) {
            System.out.println(iane.getMessage() + " in initiate method in Bank class");
        } catch(InvalidPasswordException ipe) {
            System.out.println(ipe.getMessage() + " in initiate method in Bank class");
        } catch (Exception e) {
            System.out.println("Some problem occurred");
        }
    }

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

public class Main {
    public static void main(String[] args) {
        ATM a1 = new ATM();
        ATM a2 = new ATM();
        ATM a3 = new ATM();


    }
}