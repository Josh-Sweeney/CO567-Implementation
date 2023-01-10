
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * An Event is a general class used to represent both an Event or Show at the venue.
*/
public class Event {
    // The status of the event (Cancelled, Active, etc.)
    protected EventStatus status;

    // The start date of the event
    protected LocalDate startDate;

    // The end date of the event
    protected LocalDate endDate;

    // The promotion that is applied to this event
    protected Promotion promotion;

    // The discounts that are applied to this event
    protected ArrayList<Discount> discounts;

    // The total number of tickets sold for this event (Only visible to agents)
    private int totalSoldTickets;

    /*
     * Sets the start date of the event.
     * @param startDate The start date of the event.
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /*
     * Sets the end date of the event.
     * @param endDate The end date of the event.
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /*
     * Returns the start date of the event.
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /*
     * Returns the end date of the event.
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /*
     * Cancels the event.
     */
    public void cancel() {
        status = EventStatus.Cancelled;
    }

    /*
     * Activates the event.
     */
    public void Activate() {
        status = EventStatus.Active;
    }

    /*
     * Returns the status of the event.
     */
    public EventStatus getStatus() {
        return status;
    }

    /*
     * Sets the promotion for the event. (Managed by a Venue Manager)
     * @param promotion The promotion to set for the event.
     */
    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    /*
     * Returns the promotion for the event. (Managed by a Venue Manager)
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /*
     * Adds a discount to the event. (Managed by a Venue Manager)
     * @param discount The discount to add to the event.
     */
    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    /*
     * Removes a discount from the event.
     * @param discount The discount to remove from the event.
     */
    public void removeDiscount(Discount discount) {
        discounts.remove(discount);
    }

    /*
     * Returns the discounts for the event.
     */
    public ArrayList<Discount> getDiscounts() {
        return discounts;
    }

    /*
     * This method will increment the total number of tickets sold for the event.
     * @param amount The amount to increment the total number of tickets sold by.
     */
    public void incrementTotalSoldTickets(int amount) {
        this.totalSoldTickets += amount;
    }

    /*
     * This method will return the total number of tickets sold for the event.
     */
    public int getTotalSoldTickets() {
        return totalSoldTickets;
    }
}