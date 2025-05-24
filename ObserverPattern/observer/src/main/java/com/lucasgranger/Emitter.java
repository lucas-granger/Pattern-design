package com.lucasgranger;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the IEmitter interface.
 * Maintains a list of observers and notifies them of updates.
 */
public class Emitter implements IEmitter {
    private final List<IObserver> observers = new ArrayList<>();

    /**
     * Registers an observer to receive notifications.
     *
     * @param o the observer to attach
     */
    @Override
    public void attach(IObserver o) {
        observers.add(o);
    }

    /**
     * Unregisters an observer so it no longer receives notifications.
     *
     * @param o the observer to detach
     */
    @Override
    public void detach(IObserver o) {
        observers.remove(o);
    }

    /**
     * Sends a message to all registered observers.
     *
     * @param message the message to send
     */
    @Override
    public void notifyObservers(String message) {
        for (IObserver o : observers) {
            o.update(message);
        }
    }
}
