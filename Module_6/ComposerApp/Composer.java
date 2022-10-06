public class Composer {
    private int id;
    private String name;
    private String genre;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    public Composer() {
        // Set default values.
        id = 0;
        name = "";
        genre = "";
    }

    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    /** 
     * Returns a formatted string with the ID, Name, and Genre.
     * @return String
     */
    public String toString() {
        return String.format("  Id: %d\n  Name: %s\n  Genre: %s", id, name, genre);
    }
}
