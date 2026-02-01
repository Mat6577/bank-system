package project4;

import java.util.Scanner;
import project4.Account.Account;

public class receipt {
    public static void receivePayment(Account account) {
        // Instance variables 
        String name;
        float price;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        name = System.console().readLine("Please enter the items name: ");
        System.out.print("Please enter the items price: ");
        price = scanner.nextFloat();
        System.out.println();

        account.addTransactions(false, name, price);
    }
}
