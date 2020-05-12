package components;

public class Decaf extends Beverage{
    public Decaf() {
        description = "The best coffee without coffein";
    }

    /**
     * @return the description of the beferage
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * @return the price of the Beverage
     */
    @Override
    public float cost() {
        return 1.05f;
    }

}
