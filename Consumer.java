import java.time.LocalDate;
import java.util.ArrayList;

/*
 * A Consumer is a general customer that interacts with the OTS system to 
 * view shows and events, hold and reserve seats and purchase tickets
 */
public class Consumer extends User {
    // This is the number of days in the future that an event must be to be considered upcoming
    private final int UPCOMING_EVENT_RANGE = 14;

    // This is the Consumer's current selection of seats
    private SeatSelection seatSelection;

    /*
     * A Constructor that sets the default seat selection
     */
    public Consumer() {
        seatSelection = new SeatSelection();
    }
    
    /*
     * This method will return all the events that are considered upcoming
    */
    public ArrayList<Event> getUpcomingEvents() {
        var events = this.venue.getEvents();

        var upcomingEvents = new ArrayList<Event>();

        for (var event : events) {
            if (event.getStartDate().isAfter(LocalDate.now().plusDays(UPCOMING_EVENT_RANGE))) {
                upcomingEvents.add(event);
            }
        }

        return upcomingEvents;
    }

    /*
     * This method will return all scheduled shows between the given dates
    */
    public ArrayList<Show> getScheduledShows(LocalDate startDate, LocalDate endDate) {
        var shows = this.venue.getShows();

        var scheduledShows = new ArrayList<Show>();

        for (var show : shows) {
            if (show.getStartDate().isAfter(startDate) && show.getEndDate().isBefore(endDate)) {
                scheduledShows.add(show);
            }
        }

        return scheduledShows;
    }

    /*
     * This method will add a seat to the current selection of seats
    */
    public void selectSeat(Seat seat) {
        seatSelection.selectSeat(seat);
    }

    /*
     * This method will hold a seat for the Consumer
    */
    public void HoldSeat(Seat seat) {
        seatSelection.holdSeat(seat);        
    }

    /*
     * This method will generate a Ticket for each seat that is selected and a Transaction for all the tickets
     */
    public Transaction generateTransaction() {
        var finalTransaction = new Transaction();

        // Generate a ticket for each selected seat
        var selectedSeats = seatSelection.getSelectedSeats();

        for (var seat : selectedSeats) {
            var ticket = new Ticket();
            
            ticket.setSeat(seat);
            ticket.setEvent(seat.getShow());
            
            // Add the seat to the transaction
            finalTransaction.addTicket(ticket);
        }

        return finalTransaction;
    }
}