/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

public class Ball extends Product {
    private String color;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    public Ball() {
        super(); // Call the base Product constructor.
        setColor("");
    }

    public String toString() {
        // Append the color to the base Product toString result.
        return String.format("%s\n  Color: %s", super.toString(), getColor());
    }
}
