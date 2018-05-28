package data_structure.queue;

import data_structure.queue.Queue;

public interface CircularQueue<Element> extends Queue<Element> {
    /**
     * Rotates the front element of the queue to the back of the queue.
     * This does nothing if the queue is empty.
     */
    void rotate();
}
