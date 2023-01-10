import java.util.ArrayList;

/*
 * A Venue is a class used to represent a Venue containing Events and Shows.
 */
public class Venue {
    // All events that this venue holds
    private ArrayList<Event> events;

    // All shows that this venue holds
    private ArrayList<Show> shows;

    /*
     * A Constructor that sets the default values
     */
    public Venue() {
        events = new ArrayList<Event>();
        shows = new ArrayList<Show>();
    }

    /*
     * This method will add an event to the list of events
     */
    public void addEvent(Event event) {
        events.add(event);
    }

    /*
     * This method will remove an event from the list of events
     */
    public void removeEvent(Event event) {
        events.remove(event);
    }

    /*
     * This method will return the list of events
     */
    public ArrayList<Event> getEvents() {
        return events;
    }

    /*
     * This method will add a show to the list of shows
     */
    public void addShow(Show show) {
        shows.add(show);
    }

    /*
     * This method will remove a show from the list of shows
     */
    public void removeShow(Show show) {
        shows.remove(show);
    }

    /*
     * This method will return the list of shows
     */
    public ArrayList<Show> getShows() {
        return shows;
    }
}