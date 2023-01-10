import java.time.LocalDate;
import java.util.ArrayList;

/*
 * An agent is a user that acts on behalf of a consumer / customer.
 * An agent can sell tickets to events and shows.
 * An agent can also view the total number of tickets sold for an event or show.
 */
public class Agent extends Consumer {
    /*
     * This method will return all the seats that are assigned to this agent.
     */
    public ArrayList<Seat> getAssignedSeats() {
        var seats = new ArrayList<Seat>();

        // Get all seats from all events
        for (var show : this.venue.getShows()) {
            for (var seat : show.getSeats()) {
                // If the seat is assigned to this agent, add it to the list to be returned
                if (seat.getAssignedAgent() == this) {
                    seats.add(seat);
                }
            }
        }

        return seats;
    }

    /*
     * This method will return the total amount of tickets sold for an event or show.
     * @param event The event or show to get the total number of tickets sold for.
     */
    public int getTotalSoldTickets(Event event) {
        return event.getTotalSoldTickets();
    }

    /*
     * This method will return the total amount of tickets sold for all events and shows between the given dates.
     * @param startDate The start date to get the total number of tickets sold for.
     * @param endDate The end date to get the total number of tickets sold for.
     */
    public int getTotalSoldTickets(LocalDate startDate, LocalDate endDate) {
        // Get all events from the venue
        var events = this.venue.getEvents();

        // Get all shows from the venue
        var shows = this.venue.getShows();

        // Get all events and shows that are between the given dates
        var eventsBetweenDates = new ArrayList<Event>();

        for (var event : events) {
            if (event.getStartDate().isAfter(startDate) && event.getEndDate().isBefore(endDate)) {
                eventsBetweenDates.add(event);
            }
        }

        var showsBetweenDates = new ArrayList<Show>();

        for (var show : shows) {
            if (show.getStartDate().isAfter(startDate) && show.getEndDate().isBefore(endDate)) {
                showsBetweenDates.add(show);
            }
        }

        // Get the total number of tickets sold for all events and shows
        var totalSoldTickets = 0;

        for (var event : eventsBetweenDates) {
            totalSoldTickets += event.getTotalSoldTickets();
        }

        for (var show : showsBetweenDates) {
            totalSoldTickets += show.getTotalSoldTickets();
        }

        return totalSoldTickets;
    }
}