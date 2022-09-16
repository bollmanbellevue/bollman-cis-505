
/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */
import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        // Create the scanner object to read the console input.
        Scanner input = new Scanner(System.in);

        // Print the Account selection input prompt.
        StringBuilder accountSelectText = new StringBuilder(
                "  Welcome to the Customer Account App\n\n");
        accountSelectText.append("  Enter a customer ID:\n");
        accountSelectText.append("    ex: 1007, 1008, 1009>: ");
        System.out.print(accountSelectText);

        String accountInput = input.nextLine(); // Read the console input.
        int accountId = Integer.parseInt(accountInput); // Convert the input to an integer.

        // Get the corresponding account for the ID input.
        Customer customer = CustomerDB.getCustomer(accountId);

        // Instantiate an Account object.
        Account account = new Account();

        boolean exit = false; // A flag for the program loop exit condition.
        do {
            System.out.println(); // Print an extra line to match assignment format.
            account.displayMenu(); // Print the Account interaction options

            // Read the console input for account actions.
            String menuSelection = input.nextLine();

            // Execute the logic for the input account action.
            if (menuSelection.toUpperCase().equals("D")) { // Deposit
                // Prompt the user to enter an amount to deposit.
                System.out.print("\n  Enter deposit amount: ");

                // Read the deposit input value and convert to double.
                String depositInput = input.nextLine();
                double depositAmount = Double.parseDouble(depositInput);

                // Update the account with the deposit.
                account.deposit(depositAmount);
            } else if (menuSelection.toUpperCase().equals("W")) { // Withdraw
                // Prompt the user to enter an amount to withdraw.
                System.out.print("\n  Enter withdraw amount: ");

                // Read the withdraw input value and convert to double.
                String withdrawInput = input.nextLine();
                double withdrawAmount = Double.parseDouble(withdrawInput);

                // Update the account with the withdrawal.
                account.withdraw(withdrawAmount);
            } else if (menuSelection.toUpperCase().equals("B")) { // Balance
                // display the account balance.
                System.out.printf("\n  Account Balance: $%,6.2f", account.getBalance());
            } else {
                // The input didn't match valid options.
                // Print an error.
                System.out.printf("\n  Error: Invalid option\n");
            }

            // Prompt the user to continue or exit
            System.out.print("\n  Continue? (y/n): ");
            String wantsToContinue = input.nextLine();

            // Convert the input to uppercase and check against "N"
            if (wantsToContinue.toUpperCase().equals("N")) {
                exit = true; // User entered "N" and wants to quit
            }
        } while (!exit); // Loop until the exit option is selected.

        // Print the customer and account details before exiting.
        System.out.println("\n" + customer.toString() + "\n");
        System.out.printf("  Balance as of %s is $%,6.2f\n\n", account.getTransactionDate(),
                account.getBalance());

        System.out.println("  End of line...");
        input.close(); // Close the console input reading object.
    } // end of main
} // end of TestCustomerAccountApp
