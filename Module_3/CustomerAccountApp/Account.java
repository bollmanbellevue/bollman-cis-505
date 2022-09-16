
/*
    Krasso, R., (2022). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022
    
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private double balance;

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    public Account() {
        // The default balance for new account objects is 200.
        this.balance = 200;
    }

    /** 
     * @param amt
     */
    public void deposit(double amt) {
        this.balance += amt;
    }

    /** 
     * @param amt
     */
    public void withdraw(double amt) {
        // Only update the balance if there are enough funds to witdraw. 
        if (getBalance() >= amt) {
            this.balance -= amt;
        }
    }

    /**
     * Print the Account interaction options to the console.
     */
    public void displayMenu() {
        // Deposit, Withdraw, and display Balance are the valid interaction options.
        StringBuilder menuText = new StringBuilder("  Account Menu\n");
        menuText.append("  Enter <D/d> for deposit\n");
        menuText.append("  Enter <W/w> for withdraw\n");
        menuText.append("  Enter <B/b> for balance\n");
        menuText.append("    Enter option>: ");
        System.out.print(menuText); // Output the menu text to the console.
    }

    /** 
     * Get the current date in the MM-dd-yyyy format.
     * @return String
     */
    public String getTransactionDate() {
        // Instantiate a date formatting object with date format MM-dd-yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date today = new Date(); // Get today's date.
        return dateFormat.format(today); // Return the date as a formatted string.
    }
} // end of Account
