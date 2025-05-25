package com.lucasgranger;

/**
 * Concrete strategy.
 */
public class Strategy1 implements IStrategy {
    @Override
    public void execute() {
        System.out.println("Executing Strategy 1");
    }
}
