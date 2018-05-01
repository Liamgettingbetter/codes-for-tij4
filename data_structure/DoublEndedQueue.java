package data_structure;

/**
 * Interface for a double-ended queue : a collection of elements that can be
 * inserted and removed at both ends; this interface is a simplified version of java.util.Deque.
 * @param <Element> a parameterised type representing the element being put into the deque.
 */
public interface DoublEndedQueue<Element> {
    /** Insert a new element e at the front of the deque. */
    void addFirst(Element e);

    /** Insert a new element e at the back of the deque. */
    void addLast(Element e);

    /** Remove and Return the first element of the deque, (null if the deque is empty) */
    Element removeFirst();

    /** Remove and Return the last element of the deque, (null if it's empty). */
    Element removeLast();

    /** Return the first element of the deque, but not remove it. (null if empty) */
    Element first();

    /** Return the last element of the deque, but not remove it. (null if empty) */
    Element last();

    /** Return the number of elements in the deque. */
    int size();

    /** Return a boolean indicating whether the deque is empty. */
    boolean isEmpty();
}
