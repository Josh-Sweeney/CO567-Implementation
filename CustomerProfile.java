/*
 * A CustomerProfile is a class that contains general information about a customer
 * as well as address information for shipping the tickets
 */
public class CustomerProfile {
    // The Customer's name
    private String name;

    // The Customer's address
    private String address;

    /*
     * A Constructor that takes in the name and address of the customer
     * @param name The name of the customer
     * @param address The address of the customer
     */
    public CustomerProfile(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /*
     * This method gets the name of the customer
     */
    public String getName() {
        return name;
    }

    /*
     * This method gets the address of the customer
     */
    public String getAddress() {
        return address;
    }

    /*
     * This method sets the name of the customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * This method sets the address of the customer
     */
    public void setAddress(String address) {
        this.address = address;
    }
}