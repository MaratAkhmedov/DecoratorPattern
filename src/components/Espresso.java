package components;

public class Espresso extends Beverage{
    public Espresso() {
        description = "The best Espresso in the world";
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
        return 1.99f;
    }

}
