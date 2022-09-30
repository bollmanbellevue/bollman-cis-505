/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction() {
        setDescription(""); // The default is an empty string
        setAmount(0); // The default is zero.

        // Instantiate a date formatting object with date format MM-dd-yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date today = new Date(); // Get today's date.
        setDate(dateFormat.format(today));
    }

    /*
        Note
        Figure 4.3 indicates a 2 argument constructor but this conflicts with
        functionality for reading transactions from the file.
     */
    public Transaction(String date, String description, double amount) {
        // Set the fields using the sinputs.
        setDescription(description);
        setDate(date);
        setAmount(amount);
    }

    /** 
     * Output a formatted string with the Date, Description, and Amounts.
     * @return String
     */
    public String toString() {
        return String.format("  Date: %s\n  Description: %s\n  Amount: $%,6.2f", date, description,
                amount);
    }
}
