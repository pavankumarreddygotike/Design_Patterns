package decorator;

public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;  // The beverage to be decorated

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();  // Return the description of the decorated beverage
    }

    @Override
    public double cost() {
        return beverage.cost();  // Return the cost of the decorated beverage
    }
}
