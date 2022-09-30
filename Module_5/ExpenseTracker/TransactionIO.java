/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    /** 
     * Add transactions (fields are space delimited) to a file. Creates a file if it does not exist.
     * @param transactions - List of transactions to add.
     * @throws IOException - May throw an exception if there is an issue with file Read/Write.
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        // Create a file if it does not exist.
        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        // Write each transaction to a line with space delimited fields.
        for (Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }

        // Close the PrintWriter.
        output.close();
    }

    /** 
     * Read the file contents, 1 transaction per line. The fields are space delimited.
     * @return ArrayList<Transaction> - The transactions in the file.
     * @throws IOException - May throw an exception if there is an issue with file Read/Write.
     */
    public static ArrayList<Transaction> findAll() throws IOException {
        // Instantiate a scanner with a File as the source. 
        Scanner input = new Scanner(file);

        // Create an empty ArrayList to add transactions to.
        ArrayList<Transaction> transactions = new ArrayList<>();

        // Read the file until there aren't any more records.
        while (input.hasNext()) {
            String line = input.nextLine();

            // The transaction information is space delimited.
            String[] info = line.split(" ");

            /*
                The fields are as follows based on the bulkInsert format:
                [0] Date
                [1] Description
                [2] Amount
             */
            double amount = Double.parseDouble(info[2]);

            // Instantiate new transaction with file information and add to transaction list.
            Transaction transaction = new Transaction(info[0], info[1], amount);
            transactions.add(transaction);
        }

        // Close the scanner.
        input.close();

        // Return the parsed contents.
        return transactions;
    }
}
