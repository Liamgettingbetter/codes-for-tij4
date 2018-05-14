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

    // Utility method
    private void checkIndex(int i, int j) throws IndexOutOfBoundsException {
        if(i < 0 || i >= j)
            throw new IndexOutOfBoundsException("The index is out of bound.");
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
     * @throws IndexOutOfBoundsException throws this if i is out of range.
     */
    @Override
    public Element get(int i) throws IndexOutOfBoundsException {
        checkIndex(i, current_size);
        return container[i];
    }

    /**
     * Set the element in position i of this ArrayList.
     * @param elem the element put into this ArrayList.
     * @param i the index used to denote the position.
     * @return the original element at position i.
     * @throws IndexOutOfBoundsException if i is either less than 0 or greater than / equal to current_size.
     */
    @Override
    public Element set(Element elem, int i) throws IndexOutOfBoundsException {
        checkIndex(i, current_size);

        Element result = container[i];
        container[i] = elem;
        return result;
    }

    private void swap(Element temporal, Element actual) {
        Element temp = temporal;
        temporal = actual;
        actual = temp;
    }

    /**
     * Add one element in position i and shift all elements behind i at one step.
     * @param e element to be added in this ArrayList.
     * @param i the index denoting the position.
     * @throws IndexOutOfBoundsException if i is either less than 0 or greater than/equal to current_size.
     */
    @Override
    public void add(Element e, int i) throws IndexOutOfBoundsException {
        checkIndex(i, current_size);

            for(int index = current_size; index >= i; index--) {

            }
    }

    /**
     * Remove one element
     * @param i
     * @return
     * @throws IndexOutOfBoundsException
     */
    @Override
    public Element remove(int i) throws IndexOutOfBoundsException {

    }

    public static void main(String[] args) {

    }
}