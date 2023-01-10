import java.time.LocalDate;

/**
 * A VenueManager is a user that can manage the venue, its shows and events and any promotions.
 */
public class VenueManager extends User
{
    /*
     * This method is called by the VenueManager to cancel an event or a show.
     * @param event The event to be cancelled.
     */
    public void cancelEvent(Event event) {
        event.cancel();
    }

    /*
     * This method is called by the VenueManager to reschedule an event or a show.
     * @param event The event to be rescheduled.
     * @param newStartDate The new start date for the event.
     * @param newEndDate The new end date for the event.
     */
    public void rescheduleEvent(Event event, LocalDate newStartDate, LocalDate newEndDate) {
        event.setStartDate(newStartDate);
        event.setEndDate(newEndDate);
    }

    /*
     * This method is called by the VenueManager to add a new event to the venue.
     * @param event The event to be added.
     */
    public void addEvent(Event event) {
        venue.addEvent(event);
    }

    /*
     * This method is called by the VenueManager to remove an event from the venue.
     * @param event The event to be removed.
     */
    public void removeEvent(Event event) {
        venue.removeEvent(event);
    }

    /*
     * This method is called by the VenueManager to set the maximum number of seats per customer for a show.
     * @param show The show to set the maximum number of seats per customer for.
     */
    public void setMaxSeatsPerCustomer(Show show, int maxSeats) {
        show.setMaxSeatsPerCustomer(maxSeats);
    }
}