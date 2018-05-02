package data_structure;

public class ArrayBasedDeque<Element> implements DoubleEndedQueue<Element> {

    /** Set default capacity for default construction of ArrayBasedDeque. */
    private static final int DEFAULT_CAPACITY = 100;

    private Element[] container;
    private int current_size;
    private int capacity;
    private int first;

    ArrayBasedDeque() { this(DEFAULT_CAPACITY); }
    ArrayBasedDeque(int capacity) {
        this.container = (Element[])new Object[capacity];
        this.capacity = capacity;
        this.current_size = 0;
        this.first = 0;
    }

    public boolean isFull() { return this.current_size == this.capacity; }

    private void resize() {
        Element[] temp = container;

        container = (Element[])new Object[capacity * 2];

    }


    @Override
    public boolean isEmpty() { return this.current_size == 0; }

    @Override
    public int size() { return this.current_size; }

    @Override
    public void addFirst(Element e) throws IllegalStateException {
        if(isFull()) throw new IllegalStateException("This deque is full of elements.");

        int index = first + current_size;
        if(index > capacity) {
            container[index % capacity] = e;
            first = (first - 1 + capacity) % capacity;
        }
        else {
            container[index % capacity] = e;
        }


    }

    @Override
    public Element removeFirst() throws IllegalStateException {
        if(isEmpty()) throw new IllegalStateException("This deque is empty.");
        int index = first + current_size;
        if(index > capacity) {
            container[index % capacity] =
        }
    }

    public static void main(String[] args) {

    }
}
