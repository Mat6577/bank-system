package project4.Account;

import project1.version_2.*;

public class printAccount {
    // Instance variables

    // Helper function
    public static int getAccountPrintString(Account account) { 
        return ("# Account Number: " + account.getAccountNumber()).length(); 
    } // getting the size of the Account number row

    public static int getNamePrintString(Account account) { 
        return ("# Name: " + account.getUserName()).length(); 
    } // getting the size of the User Name row

    public static int getLastNamePrintString(Account account) { 
        return ("# LastName: " + account.getUserLastName()).length(); 
    } // getting the size of the LastName row    

    public static int getBalanceSize(Account account) { 
        return ("# Balance: " + account.getBalance()).length(); 
    } // getting the size of the LastName row    

    public static int getAgeSize(Account account) { 
        return ("# Age: " + account.getAge()).length(); 
    } // getting the size of the LastName row


    // Getting the maximum length of all the rows
    public static int getMaxSize(Account account) {
        // Instance variables
        int maxSize = 0;

       // Getting the users information with the longest string size
         if (getNamePrintString(account) >= maxSize) {
            maxSize = getNamePrintString(account);
        }
        if (getAccountPrintString(account) >= maxSize) {
            maxSize = getAccountPrintString(account);
        }
        if (getLastNamePrintString(account) >= maxSize) {
            maxSize = getLastNamePrintString(account);
        }

        return maxSize;
    }

    public static void printUserInfo(Account account) {
        // Instance variables
        int spacesForAge = getMaxSize(account) - getAgeSize(account);
        int spacesForBalance = getMaxSize(account) - getBalanceSize(account);
        int spacesForName = getMaxSize(account) - getNamePrintString(account);
        int spacesForLastName = getMaxSize(account) - getLastNamePrintString(account);
        int spacesForAccountNumber = getMaxSize(account) - getAccountPrintString(account);


        // Getting upper enclosure
        printingSides.getHorizontalSpaces(0, 1);
        printingSides.getHorizontal(0, getMaxSize(account));
        System.out.println();

        // Printing the users name
        System.out.print("# name: ");
        printingSides.getHorizontalSpaces(0, spacesForName);
        System.out.print(account.getUserName());
        System.out.println(" #");

        // Printing the users LastName
        System.out.print("# LastName: ");
        printingSides.getHorizontalSpaces(0, spacesForLastName);
        System.out.print(account.getUserLastName());
        System.out.println(" #");

        // Printing the users Account number
        System.out.print("# Account number: ");        
        printingSides.getHorizontalSpaces(0, spacesForAccountNumber);
        System.out.print(account.getAccountNumber());
        System.out.println(" #");

        // Printing balance
        System.out.print("# Balance: ");        
        printingSides.getHorizontalSpaces(0, spacesForBalance);
        System.out.print(account.getBalance());
        System.out.println(" #");       

        // Printing age
        System.out.print("# Age: ");  
        printingSides.getHorizontalSpaces(0, spacesForAge);
        System.out.print(account.getAge());
        System.out.println(" #");       

        // Printing lower enclosure
        printingSides.getHorizontalSpaces(0, 1);
        printingSides.getHorizontal(0, getMaxSize(account));
        System.out.println();
    }

    public static void main(String[] args) {
        Account account = new Account( "Matome Adolph Tebello", "Mohohoma", 20);
        printUserInfo(account);
    }
}
