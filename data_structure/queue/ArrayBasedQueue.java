package data_structure.queue;

import data_structure.queue.Queue;

/**
 * This is the implementation of Queue using array as the infrastructure.
 * Feature : First-in-First-out
 * @author Hao Lei, Apr 30, 2018
 */
public class ArrayBasedQueue<Element> implements Queue<Element> {

    /** The default capacity for this queue, when no other integer value was assigned. */
    private static final int DEFAULT_CAPACITY = 100;

    private Element[] data;
    private int first;
    private int size;

    ArrayBasedQueue() { this(DEFAULT_CAPACITY); }

    ArrayBasedQueue(int capacity) {
        this.data = (Element[])new Object[capacity];
        this.first = 0;
        this.size = 0;
    }

    /**
     * Check whether the queue is empty.
     * @return true if queue is not empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }


    public boolean isFull() {
        return this.size == data.length;
    }

    /**
     * Return the current number of elements in this queue.
     * @return an integer representing the number of elements.
     */
    @Override
    public int size() { return this.size; }

    /**
     * Inserts an element into this queue.
     * @param element the element inserted.
     * @throws IllegalStateException e when this queue is full.
     */
    @Override
    public void enqueue(Element element) throws IllegalStateException {
        if(isFull()) throw new IllegalStateException("The queue is already full.");
        int temp = (first + size) % data.length;
        data[temp] = element;
        size++;
    }

    /**
     * Return but not remove the first element of this queue. (null if empty)
     * @return the first element in this queue.
     */
    @Override
    public Element first() {
        if(isEmpty()) return null;
        return data[first];
    }

    /**
     * Remove the first element in this queue. (null if empty)
     * @return reference of the removed first element.
     */
    @Override
    public Element dequeue() {
        if(isEmpty()) return null;
        Element result = data[first];
        data[first] = null;
        first = (first + 1) % data.length;
        size--;
        return result;
    }


}
