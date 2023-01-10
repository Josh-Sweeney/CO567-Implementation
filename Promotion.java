/*
 * A Promotion is applied to a show or event. 
 * It contains a pricing structure that is applied to all seats when a transaction is made.
 */
public class Promotion {
    // The pricing structure of this promotion
    private PricingStructure pricingStructure;

    /*
     * A Constructor that takes in the pricing structure of this promotion
     * @param pricingStructure the pricing structure of this promotion
     */
    public Promotion(PricingStructure pricingStructure) {
        this.pricingStructure = pricingStructure;
    }

    /*
     * This method gets the pricing structure of this promotion
     */
    public PricingStructure getPricingStructure() {
        return pricingStructure;
    }

    /*
     * This method sets the pricing structure of this promotion
     * @param pricingStructure the new pricing structure of this promotion
     */
    public void setPricingStructure(PricingStructure pricingStructure) {
        this.pricingStructure = pricingStructure;
    }

    /*
     * This method applies this promotion to the given Seat
     * @param seat the seat to apply the promotion to
     */
    public void applyPromotion(Seat seat) {
        // Apply the price of the seat based on the type of seat
        switch (seat.getType()) {
            case Adult:
                seat.setPrice(pricingStructure.getAdultPrice());
                break;
            case Child:
                seat.setPrice(pricingStructure.getChildPrice());
                break;
            case Senior:
                seat.setPrice(pricingStructure.getSeniorPrice());
                break;
            case Student:
                seat.setPrice(pricingStructure.getStudentPrice());
                break;
            default:
                break;
        }
    }
}