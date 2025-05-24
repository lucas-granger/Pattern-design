package com.lucasgranger;

/**
 * Demonstrates the Observer design pattern using Emitter and Observer classes.
 */
public final class TestObserver {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private TestObserver() {
        // Prevent instantiation
    }

    /**
     * Main method to run the observer pattern example.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Emitter emitter = new Emitter();

        Observer obs1 = new Observer("Observer 1");
        Observer obs2 = new Observer("Observer 2");

        emitter.attach(obs1);
        emitter.attach(obs2);

        emitter.notifyObservers("Update available!");
    }
}
