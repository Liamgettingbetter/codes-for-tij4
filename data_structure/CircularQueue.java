package data_structure;

public interface CircularQueue<Element> extends Queue<Element> {
    /**
     * Rotates the front element of the queue to the back of the queue.
     * This does nothing if the queue is empty.
     */
    void rotate();
}
