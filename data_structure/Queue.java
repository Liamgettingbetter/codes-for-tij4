package data_structure;

/**
 * The interface of a special data structure --- queue.
 * Features : First-in-First-Out
 * @param <Element> the parameterised type
 */
public interface Queue<Element> {
    /** return the size of Queue. */
    int size();

    /** check if the queue is empty. */
    boolean isEmpty();

    /** inserts an element at the rear of the queue. */
    void enqueue(Element element);

    /** return the first element in this queue. */
    Element first();

    /** return the first element and remove it from the queue. */
    Element dequeue();

    /** Check whether the queue is full of elements. */
    // boolean isFull(); --- should not be used in link-based queue implementation.
}
