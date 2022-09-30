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
     * @param transactions
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }

        output.close();
    }

    /** 
     * @return ArrayList<Transaction>
     * @throws IOException
     */
    public static ArrayList<Transaction> findAll() throws IOException {
        Scanner input = new Scanner(file);

        ArrayList<Transaction> transactions = new ArrayList<>();
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] info = line.split(" ");
            double amount = Double.parseDouble(info[2]);
            Transaction transaction = new Transaction(info[0], info[1], amount);
            transactions.add(transaction);
        }

        input.close();

        return transactions;
    }
}
