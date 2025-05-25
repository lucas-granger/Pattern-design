package com.lucasgranger;

/**
 * Abstract decorator class for coffee objects.
 * Implements ICoffee and contains a reference to a coffee instance
 * to extend its behavior dynamically.
 */
public abstract class CoffeeDecorator implements ICoffee {

    /** The coffee instance being decorated. */
    private ICoffee coffee;

    /**
     * Constructs a CoffeeDecorator wrapping the given coffee.
     *
     * @param coffee the coffee instance to decorate
     */
    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    /**
     * Returns the wrapped coffee instance.
     *
     * @return the coffee being decorated
     */
    protected ICoffee getCoffee() {
        return coffee;
    }
}

