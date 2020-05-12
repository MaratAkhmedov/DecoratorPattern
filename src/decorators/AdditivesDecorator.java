package decorators;

import components.Beverage;

public abstract class AdditivesDecorator extends Beverage {
    /**
     * @return the description of the Beverage
     */
    @Override
    public abstract String getDescription();
}
