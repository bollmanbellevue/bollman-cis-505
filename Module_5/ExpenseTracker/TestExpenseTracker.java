/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class TestExpenseTracker {
    public static void main(String[] args) {
        // Instantiate a scanner to read the console input.
        Scanner sc = new Scanner(System.in);

        // Print introduction message to consule.
        System.out.println("  Welcome to the Expense Tracker");

        // Create a flag to exit the loop.
        boolean shouldContinue = true;
        do {
            // Create the interaction menu text.
            String menu = "\n  Menu Options\n"
                    + "    1. View Transactions\n"
                    + "    2. Add Transactions\n"
                    + "    3. View Expense\n\n"
                    + "  Please choose an options: ";

            // Read the user menu selection.
            int input = ValidatorIO.getInt(sc, menu);

            // Execute program function given the selected input.
            if (input == 1) { // View the transactions in the expenses.txt file.
                // Using try/catch to continue if there is a file read issue.
                try {
                    // Print the transactions from the file.
                    System.out.println("\n  MONTHLY EXPENSES");
                    ArrayList<Transaction> transactions = TransactionIO.findAll();

                    // Loop through the transactions and print using the 
                    // overridden toString method.
                    for (Transaction transaction : transactions) {
                        System.out.println("\n" + transaction.toString());
                    }
                } catch (IOException ex) {
                    // Print the error message to the console. 
                    System.out.println("\n  Exception: " + ex.getMessage());
                }
            } else if (input == 2) {
                ArrayList<Transaction> transactions = new ArrayList<>();

                // Instantiate a date formatting object with date format MM-dd-yyyy
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                // Use today's date for new transactions.
                String today = dateFormat.format(new Date());

                // Create a flag to exit the add transactions loop. 
                String addMoreTransactions = "";
                do {
                    // Get the user input for the transaction
                    String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");

                    /*
                        Note
                        Figure 4.3 indicates a 2 argument constructor but this conflicts with
                        functionality for reading transactions from the file.
                    */
                    // Instantiate a new transaction with today's date.
                    Transaction transaction = new Transaction(today, description, amount);

                    // Add the transaction to the ArrayList to write to the file.
                    transactions.add(transaction);

                    // Exit the loop if the user doesn't select y to continue.
                    addMoreTransactions = ValidatorIO.getString(sc,
                            "\n  Add another transaction? (y/n): ");
                } while (addMoreTransactions.equalsIgnoreCase("y"));

                try {
                    // Attempt to write the transaction ArrayList to the file.
                    TransactionIO.bulkInsert(transactions);
                } catch (IOException ex) {
                    // Print the error message to the console.
                    System.out.println("\n  Exception: " + ex.getMessage());
                }
            } else if (input == 3) {
                // Sum the expenses from the file.
                try {
                    // Read the transactions from the file.
                    ArrayList<Transaction> transactions = TransactionIO.findAll();

                    // Add the amount field for all transactions.
                    double expenses = 0;
                    for (Transaction transaction : transactions) {
                        expenses += transaction.getAmount();
                    }

                    // Print the total monthly amount from the file.
                    System.out.printf("\n  Your total monthly expense is $%,6.2f\n", expenses);
                } catch (IOException ex) {
                    // Print the error message to the console.
                    System.out.println("\n  Exception: " + ex.getMessage());
                }
            }

            // Exit the loop if the user doesn't select y to continue.
            String wantsToContinue = ValidatorIO.getString(sc, "\n  Continue? (y/n): ");
            if (!wantsToContinue.equalsIgnoreCase("y")) {
                shouldContinue = false;
            }
        } while (shouldContinue);

        System.out.println("\n  Program terminated by the user...");
    }
}
