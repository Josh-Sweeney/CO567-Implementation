import java.util.ArrayList;

/*
 * A Transaction is a class used to represent a transaction for 1 or more tickets that a Customer has purchased.
 */
public class Transaction {
    // This is the list of tickets that have been purchased
    private ArrayList<Ticket> tickets;

    /*
     * A Constructor that sets the default values
     */
    public Transaction() {
        tickets = new ArrayList<Ticket>();
    }

    /*
     * This method will add a ticket to the current transaction
     * @param ticket The ticket to add to the transaction
     */
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    /*
     * This method will remove a ticket from the current transaction
     * @param ticket The ticket to remove from the transaction
     */
    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    /*
     * This method will return the list of tickets
     */
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    /*
     * This method will return the total price of the transaction
     * This is done by adding up the price of each ticket
     */
    public double getTotalPrice() {
        double totalPrice = 0.0;

        // Add up the price of each ticket
        // Promotions and discounts are applied for each ticket
        // See the Ticket class for more details
        for (var ticket : tickets) {
            totalPrice += ticket.getPrice();
        }

        return totalPrice;
    }

    /*
     * This method will verify a credit card number
     * The credit card number must be 16 digits and all digits
     * @param cardNumber The credit card number to verify
     * @return True if the credit card number is valid, false otherwise
     */
    public boolean verifyCreditCardNumber(String cardNumber) {
        // The card number must be 16 digits
        if (cardNumber.length() != 16) {
            return false;
        }

        // The card number must be all digits
        for (var i = 0; i < cardNumber.length(); i++) {
            if (!Character.isDigit(cardNumber.charAt(i))) {
                return false;
            }
        }

        // If we got here, the validation is successful so return true
        return true;
    }

    /*
     * This method will process the transaction
     * This will mark all seats as SOLD and increase the total sold count for each show
     * @param cardNumber The credit card number to process the transaction
     * @return True if the transaction was successful, false otherwise
     */
    public boolean processTransaction(String cardNumber) {
        // Verify the card number
        if (!verifyCreditCardNumber(cardNumber)) {
            return false;
        }

        // Mark all seats as SOLD
        for (var ticket : tickets) {
            ticket.getSeat().setStatus(SeatStatus.Sold);
        }

        // Increase the total sold count for each show
        for (var ticket : tickets) {
            // Increment by 1 since there is a one to one relationship between a ticket and a show
            ticket.getEvent().incrementTotalSoldTickets(1);
        }

        // If we got here, the process is successful so return true
        return true;
    }
}