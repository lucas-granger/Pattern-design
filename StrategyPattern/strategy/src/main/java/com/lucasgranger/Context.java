package com.lucasgranger;

/**
 * Context class that uses a strategy.
 */
public class Context {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
        System.out.println("Choosing " + strategy.getClass().getSimpleName());
    }

    public void executeStrategy() {
        System.out.println("Execute the strategy !");
        this.strategy.execute();
    }
}
