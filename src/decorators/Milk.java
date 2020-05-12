package decorators;

import components.Beverage;

public class Milk extends AdditivesDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        description = beverage + " milk";
    }

    /**
     * @return the description of the Beverage
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    /**
     * @return the price of the Beverage
     */
    @Override
    public float cost() {
        return beverage.cost() + 0.1f;
    }
}
