package innerclasses.controller;

/**
 * Created by Liam on 20/11/2016.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delay) {
        this.delayTime = delay;
        start();
    }

    public void start() {
        // Allows restarting
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
