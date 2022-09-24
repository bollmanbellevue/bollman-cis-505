/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

public class Product {
    private String code;
    private String description;
    private double price;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
        // Set code and description to empty strings.
        // Set the price to 0.
        setCode("");
        setDescription("");
        setPrice(0);
    }

    public String toString() {
        // Output a formatted string as below.
        //  Product code: X
        //  Description: X
        //  Price: $ X.00
        return String.format("  Product code: %s\n  Description: %s\n  Price: $%,6.2f", code,
                description, price);
    }
}
