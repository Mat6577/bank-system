package project4;

import java.util.Scanner;

import project4.Account.*;

public class Start {
    public static final String options = "Options are: " + //
                                         "\n1. Received payment" + //
                                         "\n2. Make Payment" + //
                                         "\n3. print Transactions" + //
                                         "\n4. exit";

    public static void main(String[] args) {
        System.out.println("Welcome to Project 4!");

        Scanner scanner = new Scanner(System.in);

        // Creating a new account
        Account account = new Account("Matome Adolph Tebello", "Mohohoma", 20);

        while (true) {
            try {
                System.out.println("Choose from the options below:\n" + options);
                System.out.print("> ");

                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("1")) {
                    Receipt.receivePayment(scanner, account);
                }

                else if (input.equalsIgnoreCase("2")) {
                    Payment.makePayment(scanner, account);
                }

                else if (input.equalsIgnoreCase("3")) {
                    account.printTransactions();            
                }
        
                else if (input.equalsIgnoreCase("4")) {
                    printAccount.printUserInfo(account);
                    System.out.println("That you for using our bank.");
                    break;
                }
                else {
                    continue;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.close();
            }
        }       
    }
}