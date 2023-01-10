/*
 * A Discount is an overall discount that can be applied to an event or show.
 * For example, a 10% discount can be applied to all tickets of an event.
 */
public class Discount {
    // The discount percentage as a decimal between 0 and 1
    private double discountPercentage;

    /*
     * A Constructor that takes in the discount percentage
     * @param discountPercentage The discount percentage as a decimal between 0 and 1
     */
    public Discount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /*
     * This method gets the discount percentage
     */
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    /*
     * This method sets the discount percentage
     */
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
