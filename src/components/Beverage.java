package components;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    /**
     * @return the description of the beferage
     */
    public abstract String getDescription();

    /**
     * @return the price of the Beverage
     */
    public abstract float cost();

}
