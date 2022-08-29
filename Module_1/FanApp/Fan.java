/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
    rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
     Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */
package FanApp;

public class Fan {
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    } // end Fan argumented constructor

    Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    } // end Fan default contructor

    /** 
     * Get the Fan property speed.
     * @return int
     */
    int getSpeed() {
        return speed;
    };

    /** 
     * Set the Fan speed.
     * @param speed
     */
    void setSpeed(int speed) {
        this.speed = speed;
    };

    /** 
     * Get the Fan property on.
     * @return boolean
     */
    boolean getOn() {
        return on;
    };

    /** 
     * Set the Fan active state, on.
     * @param on
     */
    void setOn(boolean on) {
        this.on = on;
    };

    /** 
     * Get the Fan property radius.
     * @return double
     */
    double getRadius() {
        return radius;
    };

    /** 
     * Set the Fan radius.
     * @param radius
     */
    void setRadius(double radius) {
        this.radius = radius;
    };

    /** 
     * Get the Fan property color.
     * @return String
     */
    String getColor() {
        return color;
    };

    /** 
     * Set the Fan color.
     * @param color
     */
    void setColor(String color) {
        this.color = color;
    };

    /** 
     * Override the base toString() method to display a pleasant state description.
     * @return String
     */
    public String toString() {
        // Set the default value as the "off" state for the message. 
        String fanDescription = String.format(
                "The fan is %s with a radius of %.1f and the fan is off", color, radius);

        // Check if the fan is "on"
        if (on) {
            // Update the message with the "on" state text. 
            fanDescription = String.format(
                    "The fan speed is set to %d with a color of %s and a radius of %.1f", speed, color,
                    radius);
        }

        // Return the formatted message.
        return fanDescription;
    } // end toString
} // end Fan
