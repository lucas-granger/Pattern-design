package com.lucasgranger;

/**
 * Decorator that adds milk to a coffee.
 * Extends CoffeeDecorator to enhance the coffee's description and cost.
 */
public class MilkDecorator extends CoffeeDecorator {
    private static final double MILK_COST = 0.5;

    /**
     * Constructs a MilkDecorator wrapping the given coffee.
     *
     * @param coffee the coffee instance to decorate with milk
     */
    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return getCoffee().getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return getCoffee().getCost() + MILK_COST;
    }
}
