/*
 * 
 */

import java.util.Scanner;

public class TestBowlingShopApp {
    public static void main(String[] args) {
        // Create the scanner object to read the console input.
        Scanner input = new Scanner(System.in);

        boolean exit = false;
        do {
            System.out.println();
            TestBowlingShopApp.displayMenu();
            String menuSelection = input.nextLine().toLowerCase();

            System.out.println();

            GenericQueue<Product> queue = new GenericQueue<Product>();
            if (menuSelection.equals("b")) {
                queue = ProductDB.getProducts(menuSelection);
                System.out.println("  --Product Listing--");
            } else if (menuSelection.equals("a")) {
                queue = ProductDB.getProducts(menuSelection);
                System.out.println("  --Product Listing--");
            } else if (menuSelection.equals("s")) {
                queue = ProductDB.getProducts(menuSelection);
                System.out.println("  --Product Listing--");
            } else if (menuSelection.equals("x")) {
                exit = true;
            }

            while (queue.size() > 0) {
                Product product = queue.dequeue();
                System.out.println(product.toString() + "\n");
            }
        } while (!exit);

        System.out.println("  End of line...");
        input.close(); // Close the console input reading object.
    }

    public static void displayMenu() {
        System.out.print(
                "  Menu Options\n"
                        + "  1. <b> Bowling Balls\n"
                        + "  2. <a> Bowling Bags\n"
                        + "  3. <s> Bowling Shoes\n"
                        + "  4. <x> To exit\n\n"
                        + "  Please choose an option: ");
    }
}
