/*
 * This class represents a ticket for an event.
 */
public class Ticket {
    // The seat that the ticket is for
    private Seat seat;

    // The event that the ticket is for
    private Event event;

    /*
     * This method will return the price of the ticket
     * Promtions will be applied to the price of the seat as well as any discounts
     */
    public double getPrice() {
        double price = 0.0;

        // Get the price of the seat (Promotion price if applicable)
        price += seat.getPrice();

        // Apply the discounts of the event, if applicable
        var discounts = event.getDiscounts();

        for (var discount : discounts) {
            price *= discount.getDiscountPercentage();
        }

        return price;
    }

    /*
     * This method will return the seat this ticket is for
     */
    public Seat getSeat() {
        return seat;
    }

    /*
     * This method will set the seat this ticket is for
     */
    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    /*
     * This method will return the event this ticket is for
     */
    public Event getEvent() {
        return event;
    }

    /*
     * This method will set the event this ticket is for
     */
    public void setEvent(Event event) {
        this.event = event;
    }
}