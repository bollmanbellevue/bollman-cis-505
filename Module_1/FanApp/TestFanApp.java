/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */
package FanApp;

public class TestFanApp {
    public static void main(String[] args) {
        // Instantiating a default Fan object.
        Fan lDefaultFan = new Fan();

        // Instantiate a Fan with specified parameters 
        Fan lCustomFan = new Fan(2, true, 8.0, "Blue");

        System.out.println(lDefaultFan.toString()); // Print a message for the default fan's stete.
        System.out.println(lCustomFan.toString()); // Print a message for the non-default fan's stete.
    } // end of main
} // end of TestFanApp 
