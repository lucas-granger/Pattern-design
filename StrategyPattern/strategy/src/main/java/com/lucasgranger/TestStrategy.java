package com.lucasgranger;

/**
 * Class to test Strategy Pattern implementation.
 */
public final class TestStrategy {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private TestStrategy() {
        // Prevent instantiation
    }

    /**
     * Main method to run the strategy pattern example.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new Strategy1());
        context.executeStrategy();

        System.out.println();

        context.setStrategy(new Strategy2());
        context.executeStrategy();
    }
}
