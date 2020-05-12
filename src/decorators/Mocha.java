package decorators;

import components.Beverage;

public class Mocha extends AdditivesDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        description = "Chocolate";
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
        return beverage.cost() + 0.2f;
    }
}
