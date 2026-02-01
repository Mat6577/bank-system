package project4.Account;

import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Account {
    // Instance variables
    private int age;
    private float balance;
    private String userName;
    private String userLastName;
    private String accountNumber = "";
    private Stack<Transactions> transactions;

    // Helper function
    public static int generateAccountNumber() {
        int randomInt = ThreadLocalRandom.current().nextInt(100000000, 999999999);

        return randomInt;
    }

    // Constructor 
    public Account(String un, String uln, int age){
        this.age = age;
        userName = un;
        userLastName = uln;
        balance = 0;
        accountNumber = accountNumber + generateAccountNumber();
        transactions = new Stack<Transactions>();
    }

    // Getters
    public int getAge() { return age; }
    public float getBalance() { return balance; }
    public String getUserName() { return userName; }
    public String getUserLastName() { return userLastName; }
    public String getAccountNumber() { return accountNumber; }

    // Dealing with transactions
    public void addTransactions(boolean rf, String item, float amount) {
        Transactions trans = new Transactions(rf, item, amount);
        transactions.push(trans);

        if (rf) { balance+=amount; }
        else { balance-=amount; }
    }

    public void printTransactions() {
        for (Transactions t : transactions) {
            t.printSingleTransaction();
            System.out.println();
        }
    }
}
