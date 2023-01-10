/*
 * A Seat is a seat in a show or an event.
 * Agents can be assigned to seats to sell them.
 */
public class Seat {
    // The status of the seat (Available, Sold, etc.)
    private SeatStatus status;

    // The show that this seat is in
    private Show show;

    // The type of seat (Adult, Child, etc.)
    private SeatType type;

    // The agent assigned to this seat
    private Agent assignedAgent;

    // The price of this seat
    private double price;

    /*
     * A Constructor that initializes the seat with default values
     */
    public Seat() {
        // Default seat status is available
        status = SeatStatus.Available;

        // No agent is assigned by default
        assignedAgent = null; 

        // Adult is the default seat type
        type = SeatType.Adult;

        // No show is assigned by default
        show = null;

        // Default price is 0
        price = 0;
    }

    /*
     * Returns the status of the seat
     */
    public SeatStatus getStatus() {
        return status;
    }

    /*
     * Sets the status of the seat
     * @param status the new status of the seat
     */
    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    /*
     * Returns the agent assigned to this seat
     */
    public Agent getAssignedAgent() {
        return assignedAgent;
    }

    /*
     * Sets the agent assigned to this seat
     * @param assignedAgent the new agent assigned to this seat
     */
    public void setAssignedAgent(Agent assignedAgent) {
        this.assignedAgent = assignedAgent;
    }

    /*
     * Returns the type of seat
     */
    public SeatType getType() {
        return type;
    }

    /*
     * Sets the type of seat
     * @param type the new type of seat
     */
    public void setType(SeatType type) {
        this.type = type;
    }

    /*
     * Returns the show that this seat is in
     */
    public Show getShow() {
        return show;
    }

    /*
     * Sets the show that this seat is in
     * @param show the new show that this seat is in
     */
    public void setShow(Show show) {
        this.show = show;
    }

    /*
     * Returns the price of this seat
     */
    public double getPrice() {
        // Apply the promotion to this seat if there is one
        var promotion = show.getPromotion();

        // Check if the promotion is not null
        if (promotion != null) {
            // Apply the promotion to this seat
            promotion.applyPromotion(this);
        }

        return price;
    }
    
    /*
     * Sets the price of this seat
     * @param price the new price of this seat
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
