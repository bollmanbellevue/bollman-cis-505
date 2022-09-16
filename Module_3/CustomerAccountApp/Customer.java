/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */
public class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    public Customer() {
        this("", "", "", "");
    }

    public Customer(String name, String address, String city, String zip) {
        // Set the customer details using the setters.
        setName(name);
        setAddress(address);
        setCity(city);
        setZip(zip);
    }

    /** 
     * Format a summary of the Name, Address, City, and Zip of a customer.
     * @return String
     */
    public String toString() {
        return String.format(
                "  --Customer Details--\n  Name: %s\n  Address: %s\n  City: %s\n  Zip: %s",
                getName(), getAddress(), getCity(),
                getZip());
    }
} // end of Customer
