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
        type = "";
    }

    public String toString() {
        return String.format("%s\n  Type: %s", super.toString(), getType());
    }
}
