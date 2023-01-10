/*
 * An User is a class that represents a user of the OTS system. 
 * An User is a base class that is built upon by an Agent, Consumer and Venue Manager
*/
public class User {
    // The login of the user
    private Login login;

    // The profile of the user
    private CustomerProfile profile;
    
    // The venue that the user has logged in to
    protected Venue venue;

    /*
     * This method attempts to log the user in with the given username and password
     * If the login is successful, the method returns true, otherwise it returns false
     */
    public boolean login(String username, String password) {
        return login.verifyLogin(username, password);
    }

    /*
     * This method updates the Customers Profile
     */
    public void setCustomerProfile(CustomerProfile profile) {
        this.profile = profile;
    }

    /*
     * This method returns the Customers Profile
     */
    public CustomerProfile getCustomerProfile() {
        return profile;
    }
}