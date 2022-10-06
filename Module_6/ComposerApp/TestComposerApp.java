/*
    Krasso, R., (2022). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {
    public static void main(String[] args) {
        // Instantiate a scanner to read the console input.
        Scanner sc = new Scanner(System.in);

        // Print introduction message to consule.
        System.out.println("  Welcome to the Composer App");

        MemComposerDao mcd = new MemComposerDao();

        // Create a flag to exit the loop.
        boolean shouldContinue = true;
        do {
            // Display the interaction menu text.
            String menu = "\n  Menu Options\n"
                    + "    1. View Composers\n"
                    + "    2. Find Composer\n"
                    + "    3. Add Composer\n"
                    + "    4. Exit\n\n"
                    + "  Please choose an option: ";
            System.out.print(menu);

            // Read the user menu selection.
            int selection = sc.nextInt();
            sc.nextLine();

            // Execute program function given the selected input.
            if (selection == 1) { // View Composers
                System.out.println("\n\n  --DISPLAYING COMPOSERS--");
                List<Composer> composers = mcd.findAll();
                for (Composer composer : composers) {
                    System.out.println(composer.toString() + "\n");
                }
            } else if (selection == 2) { // Find Composer
                // Get an id from the user.
                System.out.print("\n  Enter an id: ");
                int id = sc.nextInt();
                sc.nextLine();

                // Lookup the composer using the id.
                Composer composer = mcd.findBy(id);

                // Display the corresponding composer
                System.out.println("\n\n  --DISPLAYING COMPOSER--");
                System.out.println(composer.toString());
            } else if (selection == 3) { // Add Composer
                // Get the new composer id.
                System.out.print("\n  Enter an id: ");
                int id = sc.nextInt();
                sc.nextLine();

                // Get the new composer name.
                System.out.print("  Enter a name: ");
                String name = sc.nextLine();

                // Get the new composer genre.
                System.out.print("  Enter a genre: ");
                String genre = sc.nextLine();

                // Create a new composer and add it to the list.
                Composer composer = new Composer(id, name, genre);
                mcd.insert(composer);
            } else if (selection == 4) { // Exit
                // Set the flag to exit the application loop.
                shouldContinue = false;
            }
        } while (shouldContinue); // Check if the user wants to continue.

        // Close the scanner cobject.
        sc.close();

        System.out.println("\n  Program terminated by the user...");
    }
}
