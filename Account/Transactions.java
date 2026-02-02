package project4.Account;

import java.util.Date;
import project1.version_2.*;

public class Transactions {
    // Instance variables 
    private Date dateOfTransaction;
    private boolean reflection;
    private float Amount;
    private String ItemsBought;


    // Create transaction
    public Transactions(boolean rl, String items, float amount) {
        dateOfTransaction = new Date();
        reflection = rl;
        Amount = amount;
        ItemsBought = items;
    }

    // Print Transactions
    public void printSingleTransaction() {
        printingSides.getHorizontal(0, 10);
        System.out.println();

        System.out.println("# " + dateOfTransaction);

        // Printing the positive or negative transaction
        if (reflection)
            System.out.println("# " + Amount);
        else
            System.out.println("# -" + Amount);

        System.out.println("# " + ItemsBought);
        printingSides.getHorizontal(0, 10);
    }
}
