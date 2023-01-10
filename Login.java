
/*
 * A Login is a class that represents a login for a user of the OTS system.
 */
public class Login {
    // The username of the user
    private String username;

    // The password of the user
    private String password;

    /*
     * A Constructor that takes in the username and password of the user
     * @param username The username of the user
     * @param password The password of the user
     */
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*
     * This method matches the given username and password with the saved username and password of the user
     * If the username and password match, the method returns true, otherwise it returns false
     * @param username The username of the user
     * @param password The password of the user
     */
    public boolean verifyLogin(String username, String password) {
        return (this.username.equals(username) && this.password.equals(password));
    }
}