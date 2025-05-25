package com.lucasgranger;

/**
 * Interface representing a coffee component.
 * Provides methods to get the description and cost of the coffee.
 */
public interface ICoffee {

    /**
     * Returns the description of the coffee.
     *
     * @return description as a String
     */
    String getDescription();

    /**
     * Returns the cost of the coffee.
     *
     * @return cost as a double
     */
    double getCost();
}
