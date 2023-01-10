/*
 * A PricingStructure is a class that defines the prices of each type of seat in a promotion
 */
public class PricingStructure {
    // The price of an adult seat
    private double adultPrice;

    // The price of a child seat
    private double childPrice;

    // The price of a senior seat
    private double seniorPrice;

    // The price of a student seat
    private double studentPrice;

    /*
     * A Constructor that takes in the price of each type of seat
     * @param adultPrice the price of an adult seat
     * @param childPrice the price of a child seat
     * @param seniorPrice the price of a senior seat
     * @param studentPrice the price of a student seat
     */
    public PricingStructure(double adultPrice, double childPrice, double seniorPrice, double studentPrice) {
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.seniorPrice = seniorPrice;
        this.studentPrice = studentPrice;
    }

    /*
     * This method gets the price of an adult seat
     */
    public double getAdultPrice() {
        return adultPrice;
    }

    /*
     * This method gets the price of a child seat
     */
    public double getChildPrice() {
        return childPrice;
    }

    /*
     * This method gets the price of a senior seat
     */
    public double getSeniorPrice() {
        return seniorPrice;
    }

    /*
     * This method gets the price of a student seat
     */
    public double getStudentPrice() {
        return studentPrice;
    }
}