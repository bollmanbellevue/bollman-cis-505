public class CustomerDB {

    /** 
     * Lookup a Customer by ID.
     * Returns a default Customer object if ID is not found.
     * @param id
     * @return Customer
     */
    public static Customer getCustomer(int id) {
        if (id == 1007) {// Instantiate and return customer 1007.
            return new Customer("Jimmy Ayala", "1317 Q St Suite 150", "Lincoln", "68508");
        } else if (id == 1008) {// Instantiate and return customer 1008.
            return new Customer("Frida Catlo", "541 Cedar St", "Ashland", "68003");
        } else if (id == 1009) {// Instantiate and return customer 1009.
            return new Customer("Alex Reagan", "750 16th Ave E", "Seattle", "98112");
        } else { // Id wasn't found, return a default customer.
            return new Customer();
        }
    }
} // end of CustomerDB
