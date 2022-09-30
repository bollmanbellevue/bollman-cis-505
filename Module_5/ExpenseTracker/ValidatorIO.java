/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022
 */

import java.util.Scanner;

public class ValidatorIO {

    /** 
     * Get an int from console input. Will retry until valid input is read.
     * @param sc
     * @param prompt
     * @return int
     */
    public static int getInt(Scanner sc, String prompt) {
        int input = 0; // Set the default value.

        // Create a flag and ask for input until a valid value is read.
        boolean isValid = false;
        while (!isValid) {
            // Print the given console prompt.
            System.out.print(prompt);

            // Check the scanner if the input is an int.
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                // Display an error on other inputs.
                System.out.println("\n  Error! Invalid integer value.\n");
            }

            // Clear the scanner for the next line.
            sc.nextLine();
        }

        // Return valid console value.
        return input;
    }

    /** 
     * Get an double from console input. Will retry until valid input is read.
     * @param sc
     * @param prompt
     * @return double
     */
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;

        // Create a flag and ask for input until a valid value is read.
        boolean isValid = false;
        while (!isValid) {
            // Print the given console prompt.
            System.out.print(prompt);

            // Check the scanner if the input is a double.
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                // Display an error on other inputs.
                System.out.println("\n  Error! Invalid dobule value.\n");
            }

            // Clear the scanner for the next line.
            sc.nextLine();
        }

        // Return valid console value.
        return input;
    }

    /** 
     * Get a string from console input.
     * @param sc
     * @param prompt
     * @return String
     */
    public static String getString(Scanner sc, String prompt) {
        // Print the given console prompt.
        System.out.print(prompt);

        // Read the console input.
        String input = sc.next();

        // Clear the scanner for the next line.
        sc.nextLine();

        // Return console value.
        return input;
    }
}
