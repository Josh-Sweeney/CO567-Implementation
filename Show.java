import java.util.ArrayList;

/*
 * A Show is a class used to represent a Show at the venue.
 * It is a subclass of Event and contains a list of seats.
 */
public class Show extends Event {
    // This is the list of seats that are available for this show
    private ArrayList<Seat> seats;

    // This is the maximum number of seats that a customer can purchase
    private int maxSeatsPerCustomer;

    /*
     * A Constructor that sets the default values
     */
    public Show() {
        this.maxSeatsPerCustomer = 0;
        this.seats = new ArrayList<Seat>();
    }

    /*
     * This method will set the maximum number of seats that a customer can purchase
     * @return The number of seats available for this show
     */
    public void setMaxSeatsPerCustomer(int maxSeats) {
        this.maxSeatsPerCustomer = maxSeats;
    }

    /*
     * This method will return the maximum number of seats that a customer can purchase
     * @return The number of seats available for this show
     */
    public int getMaxSeatsPerCustomer() {
        return maxSeatsPerCustomer;
    }

    /*
     * This method will return the list of seats available for this show
     * @return The list of seats available for this show
     */
    public ArrayList<Seat> getSeats() {
        return seats;
    }

    /*
     * This method will add a seat to the list of seats available for this show
     * @param seat The seat to add to the list of seats available for this show
     */
    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    /*
     * This method will remove a seat from the list of seats available for this show
     * @param seat The seat to remove from the list of seats available for this show
     */
    public void removeSeat(Seat seat) {
        seats.remove(seat);
    }
}
