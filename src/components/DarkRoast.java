package components;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Good coffee";
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
        return 0.99f;
    }

}
