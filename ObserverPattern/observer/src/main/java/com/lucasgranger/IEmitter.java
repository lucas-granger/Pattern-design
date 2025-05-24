package com.lucasgranger;

/**
 * Represents an emitter in the Observer pattern.
 * An emitter can register, remove, and notify observers.
 */
public interface IEmitter {

    /**
     * Attaches an observer to receive notifications.
     *
     * @param o the observer to attach
     */
    void attach(IObserver o);

    /**
     * Detaches an observer so it no longer receives notifications.
     *
     * @param o the observer to detach
     */
    void detach(IObserver o);

    /**
     * Notifies all attached observers with a message.
     *
     * @param message the message to send to observers
     */
    void notifyObservers(String message);
}
