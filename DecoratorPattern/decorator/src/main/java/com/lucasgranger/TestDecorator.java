package com.lucasgranger;

/**
 * Class to test Decorator Pattern implementation.
 */
public final class TestDecorator {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private TestDecorator() {
        // Prevent instantiation
    }

    /**
     * Main method to run the decorator pattern example.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ICoffee coffee = new Coffee();
        coffee = new MilkDecorator(coffee);
        coffee = new ChocolateDecorator(coffee);

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total: " + coffee.getCost() + " euros");
    }
}
