/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

import java.util.Scanner;

public class TestBowlingShopApp {
    public static void main(String[] args) {
        System.out.println("  Welcome to the Bowling Shop\n");

        // Create the scanner object to read the console input.
        Scanner input = new Scanner(System.in);

        // Flag to check if user wants to exit application.
        boolean exit = false;

        // Loop where the user selects actions from a menu.
        do {
            System.out.println(); // Print line for formatting.
            displayMenu(); // Display the menu to the user.

            String menuSelection = input.nextLine(); // Capture user selection.
            System.out.println(); // Print line for formatting.

            // Get the products based on user selection.
            GenericQueue<Product> products = ProductDB.getProducts(menuSelection);

            if (products.size() > 0) { // Only print the Heading if there are products to display.
                System.out.println("  --Product Listing--");
            } else if (menuSelection.equals("x")) { // Exit if use selected 'x' menu option.
                exit = true;
            }

            // Loop while the queue contains products.
            while (products.size() > 0) {
                Product product = products.dequeue(); // Get the next product.
                System.out.println(product.toString() + "\n"); // Print the product information.
            }
        } while (!exit); // Exit if use selected 'x' menu option.

        System.out.println("\n  End of line...");
        input.close(); // Close the console input reading object.
    }

    /**
     * Print the interaction menu to the console.
     */
    public static void displayMenu() {
        System.out.print(
                "  Menu Options\n"
                        + "    1. <b> Bowling Balls\n"
                        + "    2. <a> Bowling Bags\n"
                        + "    3. <s> Bowling Shoes\n"
                        + "    4. <x> To exit\n"
                        + "\n"
                        + "  Please choose an option: ");
    }
}
