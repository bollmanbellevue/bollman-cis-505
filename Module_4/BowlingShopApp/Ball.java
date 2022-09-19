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
        color = "";
    }

    public String toString() {
        return String.format("%s\n  Color: %s", super.toString(), getColor());
    }
}
