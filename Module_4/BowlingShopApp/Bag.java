/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

public class Bag extends Product {
    private String type;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    public Bag() {
        super(); // Call the base Product constructor.
        setType("");
    }

    public String toString() {
        // Append the type to the base Product toString result.
        return String.format("%s\n  Type: %s", super.toString(), getType());
    }
}
