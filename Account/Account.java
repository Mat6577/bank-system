package project4.Account;

import java.util.concurrent.ThreadLocalRandom;

public class Account {
    // Instance variables
    private int age;
    private float balance;
    private String userName;
    private String userLastName;
    private String accountNumber;

    // Helper function
    public static int getAccountNumber() {
        int randomInt = ThreadLocalRandom.current().nextInt(100000000, 999999999);

        return randomInt;
    }

    // Constructor 
    public Account(String un, String uln, int age){
        this.age = age;
        userName = un;
        userLastName = uln;
        balance = 0;
        accountNumber = accountNumber + getAccountNumber();
    }

    // Getters
    public int getAge() { return age; }
    public float getBalance() { return balance; }
    public String getUserName() { return userName; }
    public String getUserLastName() { return userLastName; }
    public String getAccountNUmber() { return accountNumber; }
}
