package com.lucasgranger;

/**
 * Concrete implementation of ICoffee representing a simple coffee.
 */
public class Coffee implements ICoffee {

    /**
     * Returns the description of this coffee.
     *
     * @return description string
     */
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    /**
     * Returns the cost of this coffee.
     *
     * @return cost as a double
     */
    @Override
    public double getCost() {
        return 2.0;
    }
}
