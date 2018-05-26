package data_structure;

public class ArrayList<Element> implements List<Element> {

    private static final int DEFAULT_CAPACITY = 20;

    private Element[] container;
    private int capacity;
    private int current_size;

    public ArrayList() { this(DEFAULT_CAPACITY); }

    public ArrayList(int capacity) {
        this.container = (Element[])new Object[capacity];
        this.capacity = capacity;
        this.current_size = 0;
    }

    // Utility method to resize the array.
    private void resize() {
        Element[] temp = container;

        this.capacity *= 2;
        container = (Element[])new Object[capacity];

        System.arraycopy(temp, 0, container, 0, temp.length);
    }

    // Utility method for swapping two elements in the array.
    private void swap(Element temporal, Element actual) {
        Element temp = temporal;
        temporal = actual;
        actual = temp;
    }

    // Utility method
    private void checkIndex(int i, int j) throws IndexOutOfBoundsException {
        if(i < 0 || i >= j) throw new IndexOutOfBoundsException("The index is out of bound.");
    }

    /**
     * Return the current size in this ArrayList.
     * @return an Integer denoting the current size.
     */
    @Override
    public int size() { return this.current_size; }

    /**
     * Implementation of method in interface List.
     * @return true if current size is 0, false otherwise.
     */
    @Override
    public boolean isEmpty() { return this.current_size == 0; }

    /**
     * Return the Element in this ArrayList at position i.
     * @param i the position to retrieve value.
     * @return Element at the position i.
     */
    @Override
    public Element get(int i) {
        checkIndex(i, current_size);
        return container[i];
    }

    /**
     * Set the element in position i of this ArrayList.
     * @param elem the element put into this ArrayList.
     * @param i the index used to denote the position.
     * @return the original element at position i.
     */
    @Override
    public Element set(Element elem, int i) {
        checkIndex(i, current_size);

        Element result = container[i];
        container[i] = elem;
        return result;
    }

    /**
     * Add one element in position i and shift all elements behind i with one-step.
     * @param e element to be added in this ArrayList.
     * @param i the index denoting the position.
     */
    @Override
    public void add(Element e, int i) {
        checkIndex(i, current_size);

        for(int index = current_size; index >= i; index--) {
            swap(container[index+1], container[index]);
        }

        container[i] = e;
        current_size++;
    }

    /**
     * Remove one element from this array.
     * @param i the index at which the element will be removed.
     * @return the element removed from this array.
     */
    @Override
    public Element remove(int i) {
        checkIndex(i, current_size);

        Element result = container[i];

        for(int index = i; index < current_size; index++) {
            swap(container[index], container[index+1]);
        }
        current_size--;
        return result;
    }

    public static void main(String[] args) {
        
    }
}
