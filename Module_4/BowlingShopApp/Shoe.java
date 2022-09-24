/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

public class Shoe extends Product {
    private double size;

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    public Shoe() {
        super(); // Call the base Product constructor.
        setSize(0);
    }

    public String toString() {
        // Append the size to the base Product toString result.
        return String.format("%s\n  Size: %.1f", super.toString(), getSize());
    }
}
