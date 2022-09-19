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
        size = 0;
    }

    public String toString() {
        return String.format("%s\n  Size: %.1f", super.toString(), getSize());
    }
}
