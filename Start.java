package project4;

import java.util.Scanner;
import project4.Account.*;

public class Start {
    public static void main(String[] args) {
        System.out.println("Welcome to Project 4!");
        // Additional startup logic can be added here
        Scanner scanner = new Scanner(System.in);

        Account account = new Account("Matome Adolph Tebello", "Mohohoma", 20);
        receipt.receivePayment(scanner, account);
        account.printTransactions();

        receipt.receivePayment(scanner, account);
        account.printTransactions();

        payment.makePayment(scanner, account);
        account.printTransactions();

        printAccount.printUserInfo(account);

        scanner.close();
    }
}