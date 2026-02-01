package project4.Account;

import java.util.Date;
import project1.version_2.*;

public class Transactions {
    // Instance variables 
    private static Date dateOfTransaction;
    private static boolean reflection;
    private static String ItemsBought;


    // Create transaction
    public Transactions(boolean rl, String items) {
        dateOfTransaction = new Date();
        reflection = rl;
        ItemsBought = items;
    }

    // Print Transactions
    public void printSingleTransaction() {
        printingSides.getHorizontal(0, 10);
        System.out.println("# " + dateOfTransaction);
        System.out.println("# " + reflection);
        System.out.println("# " + ItemsBought);
        printingSides.getHorizontal(0, 10);
    }
}
