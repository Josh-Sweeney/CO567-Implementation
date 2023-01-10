import java.util.ArrayList;

/*
 * A SeatSelection is a class used to represent a selection of seats for a customer.
 */
public class SeatSelection {
    // This is the list of seats that have been selected
    private ArrayList<Seat> selectedSeats;

    // This is the list of seats that have been held
    private ArrayList<Seat> heldSeats;

    /*
     * A Constructor that sets the default seat selection
     */
    public SeatSelection() {
        selectedSeats = new ArrayList<Seat>();
        heldSeats = new ArrayList<Seat>();
    }

    /*
     * This method will add a seat to the current selection of seats
     * It will also mark it as held
     * @param seat The seat to add to the selection
     */
    public void selectSeat(Seat seat) {
        seat.setStatus(SeatStatus.Held);

        selectedSeats.add(seat);
    }

    /*
     * This method will hold a seat for the Consumer
     * @param seat The seat to hold
     */
    public void holdSeat(Seat seat) {
        seat.setStatus(SeatStatus.Held);

        heldSeats.add(seat);
    }

    /*
     * This method will remove a seat from the current selection of seats
     * It will also mark it as available
     * @param seat The seat to remove from the selection
     */
    public ArrayList<Seat> getSelectedSeats() {
        return selectedSeats;
    }

    /*
     * This method will return the list of held seats
     */
    public ArrayList<Seat> getHeldSeats() {
        return heldSeats;
    }
}