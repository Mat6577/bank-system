package project4;

import java.util.Scanner;
import project4.Account.Account;

public class Payment {
    public static void makePayment(Scanner scanner, Account account) {
        // Instance variables 
        String name;
        float price;
        
        System.out.print("\nPlease enter the items name: ");
        name = scanner.nextLine();

        System.out.print("Please enter the items price: ");
        price = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.println();

        account.addTransactions(false, name, price);
    }
}
