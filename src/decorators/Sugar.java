package decorators;

import components.Beverage;

public class Sugar extends AdditivesDecorator {
    Beverage beverage;
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
        description= "One spoon of sugar";
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
        return beverage.cost();
    }
}
