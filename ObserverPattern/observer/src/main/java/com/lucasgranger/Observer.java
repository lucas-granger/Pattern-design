package com.lucasgranger;

/**
 * Concrete implementation of the IObserver interface.
 * Displays received messages with the observer's name.
 */
public class Observer implements IObserver {
    private final String name;

    /**
     * Constructs an observer with a given name.
     *
     * @param name the name of the observer
     */
    public Observer(String name) {
        this.name = name;
    }

    /**
     * Receives a message from the emitter and prints it.
     *
     * @param message the message sent by the emitter
     */
    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
