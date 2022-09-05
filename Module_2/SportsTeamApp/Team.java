public class Team {
    public String teamName; // Store the team name.
    public String[] players; // Store the list of players
    public int playerCount; // Store current player count.

    // The default constructor
    public Team() {
        this.teamName = ""; // The default name is blank
        this.players = new String[20]; // The default team size is 20 players
        this.playerCount = 0; // We start with no players
    }

    // Argumented constructor taking a team name
    public Team(String teamName) {
        this.teamName = teamName; // Instantiate the team with provided name
        this.players = new String[20]; // The default team size is 20 players
        this.playerCount = 0; // We start with no players
    }

    // Method to add player name to player array
    public void addPlayer(String player) {
        // Set the player next array index to the name.
        this.players[playerCount] = player;
        playerCount++; // Increment the player index.
    }

    // Getter to return the array of players.
    public String[] getPlayers() {
        return this.players;
    }

    // Getter to return the total players on team.
    public int getPlayerCount() {
        return this.playerCount;
    }

    // Getter to return the team name
    public String getTeamName() {
        return this.teamName;
    }
} // end of Team