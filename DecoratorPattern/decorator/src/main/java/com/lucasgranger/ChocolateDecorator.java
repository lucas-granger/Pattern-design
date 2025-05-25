package com.lucasgranger;

/**
 * Decorator that adds chocolate to the coffee.
 */
public class ChocolateDecorator extends CoffeeDecorator {
    private static final double CHOCOLATE_COST = 0.7;

    /**
     * Constructs a ChocolateDecorator wrapping the given coffee.
     *
     * @param coffee the coffee to decorate
     */
    public ChocolateDecorator(ICoffee coffee) {
        super(coffee);
    }

    /**
     * Returns the description of the coffee with chocolate added.
     *
     * @return the coffee description with chocolate
     */
    @Override
    public String getDescription() {
        return getCoffee().getDescription() + ", chocolate";
    }

    /**
     * Returns the cost of the coffee including the price for chocolate.
     *
     * @return the total cost with chocolate
     */
    @Override
    public double getCost() {
        return getCoffee().getCost() + CHOCOLATE_COST;
    }
}
