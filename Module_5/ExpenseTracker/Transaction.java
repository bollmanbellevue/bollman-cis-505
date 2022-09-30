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
        setDescription("");
        setAmount(0);

        // Instantiate a date formatting object with date format MM-dd-yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date today = new Date(); // Get today's date.
        setDate(dateFormat.format(today));
    }

    public Transaction(String date, String description, double amount) {
        setDescription(description);
        setDate(date);
        setAmount(amount);
    }

    /** 
     * @return String
     */
    public String toString() {
        return String.format("  Date: %s\n  Description: %s\n  Amount: $%,6.2f", date, description,
                amount);
    }
}
