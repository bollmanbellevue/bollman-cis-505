public class Product {
    private String code;
    private String description;
    private double price;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    public String toString() {
        return String.format("  Product Code: %s\n  Description: %s\n  Price: $ %,6.2f", code, description, price);
    }
}
