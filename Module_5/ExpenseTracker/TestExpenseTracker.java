import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class TestExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("  Welcome to the Expense Tracker");

        boolean shouldContinue = true;
        do {
            String menu = "\n  Menu Options\n"
                    + "    1. View Transactions\n"
                    + "    2. Add Transactions\n"
                    + "    3. View Expense\n\n"
                    + "  Please choose an options: ";

            int input = ValidatorIO.getInt(sc, menu);

            if (input == 1) {
                try {
                    System.out.println("\n  MONTHLY EXPENSES");
                    ArrayList<Transaction> transactions = TransactionIO.findAll();

                    for (Transaction transaction : transactions) {
                        System.out.println("\n" + transaction.toString());
                    }
                } catch (IOException ex) {
                    System.out.println("\n  Exception: " + ex.getMessage());
                }
            } else if (input == 2) {
                ArrayList<Transaction> transactions = new ArrayList<>();

                // Instantiate a date formatting object with date format MM-dd-yyyy
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                // Use today's date for new transactions.
                String today = dateFormat.format(new Date());

                String addMoreTransactions = "";
                do {
                    String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");

                    /*
                        Note
                        Figure 4.3 indicates a 2 argument constructor but this conflicts with
                        functionality for reading transactions from the file.
                    */
                    Transaction transaction = new Transaction(today, description, amount);

                    transactions.add(transaction);
                    addMoreTransactions = ValidatorIO.getString(sc,
                            "\n  Add another transaction? (y/n): ");
                } while (addMoreTransactions.equalsIgnoreCase("y"));

                try {
                    TransactionIO.bulkInsert(transactions);
                } catch (IOException ex) {
                    System.out.println("\n  Exception: " + ex.getMessage());
                }
            } else if (input == 3) {
                try {
                    ArrayList<Transaction> transactions = TransactionIO.findAll();
                    double expenses = 0;
                    for (Transaction transaction : transactions) {
                        expenses += transaction.getAmount();
                    }
                    System.out.printf("\n  Your total monthly expense is $%,6.2f\n", expenses);
                } catch (IOException ex) {
                    System.out.println("\n  Exception: " + ex.getMessage());
                }
            }

            String wantsToContinue = ValidatorIO.getString(sc, "\n  Continue? (y/n): ");
            if (!wantsToContinue.equalsIgnoreCase("y")) {
                shouldContinue = false;
            }
        } while (shouldContinue);

        System.out.println("\n  Program terminated by the user...");
    }
}
