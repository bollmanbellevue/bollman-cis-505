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
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Composer() {
        setId(0);
        setName("");
        setGenre("");
    }

    public Composer(int id, String name, String genre) {
        setId(id);
        setName(name);
        setGenre(genre);
    }

    public String toString() {
        return String.format("  Id: %d\n  Name: %s\n  Genre: %s", id, name, genre);
    }
}
