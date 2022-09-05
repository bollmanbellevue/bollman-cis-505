
/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */
import java.util.Scanner;

public class TestSportsTeam {
    public static void main(String[] args) {
        boolean exit = false; // A flag for the program loop exit condition.
        Scanner input = new Scanner(System.in); // Create the scanner object to read the console input.

        // Print the app startup message
        System.out.println("  Welcome to the Sports Team App");

        // The program will continue until the user inputs an exit command
        while (!exit) {
            // Prompt the user for the team name.
            System.out.print("\n  Enter a team name: ");
            String teamName = input.nextLine(); // Read the console input.
            Team team = new Team(teamName); // Instantiate a new team with the user provided name.

            // Prompt the user for the player names.
            // Provide the user with input formatting criteria.
            System.out.print("\n  Enter the player names:");
            System.out.print("\n    hint: use commas for mulitple players; no spaces>: ");
            String playerList = input.nextLine(); // Read the console input.

            // Split the comma delimited player names into a String array.
            String[] players = playerList.split(",");

            // Loop through the name list and add them to the team object.
            for (int index = 0; index < players.length; index++) {
                team.addPlayer(players[index]);
            }

            // Print the team object details player count.
            System.out.printf("\n  --Team Summary--\n  Number of players in team: %s\n",
                    team.getPlayerCount());

            // Print the player names.
            System.out.print("  Players on team: ");

            // Loop through the player name array and print each.
            String[] teamPlayers = team.getPlayers();
            for (int index = 0; index < teamPlayers.length; index++) {
                // Check if the array value is null and skip if it is.
                if (teamPlayers[index] == null) {
                    continue;
                }
                System.out.printf("%s,", teamPlayers[index]);
            }

            // Prompt the user to continue or exit
            System.out.print("\n\n  Continue? (y/n): ");
            String wantsToContinue = input.nextLine();

            // Convert the input to uppercase and check against "N"
            if (wantsToContinue.toUpperCase().equals("N")) {
                exit = true; // Player entered "N" and wants to quit
            }
        }

        // Output final program message
        System.out.println("\n  End of line...");

        // Close the console input object
        input.close();
    } // end of main
} // end of TestSportsTeam
