package com.lucasgranger;

/**
 * Represents an observer in the Observer pattern.
 * Observers are notified by emitters when an update occurs.
 */
public interface IObserver {

    /**
     * Called when the observer is notified of a new message.
     *
     * @param message the message sent by the emitter
     */
    void update(String message);
}
