package data_structure.list;

import data_structure.Iterator.Iterable;
import data_structure.Iterator.Iterator;

public class ArrayList<Element> implements List<Element>, Iterable<Element> {

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

    // Inner Iterator class
    private class ArrayIterator<Element> implements Iterator<Element> {

        private int next_to_return = 0;     // index of the next element to be returned.
        private boolean removable = false;  // whether remove() can be called at this time?


        /** Check whether the iterator comes to the end of the list. */
        @Override
        public boolean hasNext() {
            return next_to_return < current_size;
        }

        /**
         * Returns the next element in this list,
         * if there are still some elements that have not been iterated through.
         * @return the Next Element in this list.
         */
        @Override
        public Element next() {
            if(hasNext()) {
                removable = true;
                return (Element) container[next_to_return++];
            }
            return null;
        }

        /**
         * Removes the element returned by most recent call to next.
         * @throws IllegalStateException if next has not been called yet.
         * @throws IllegalStateException if remove was already called since recent next.
         */
        @Override
        public void remove() throws IllegalStateException {
            if(!removable) throw new IllegalStateException("Nothing to remove.");
            ArrayList.this.remove(next_to_return - 1);
            next_to_return--;
            removable = false;
        }
    }

    /**
     * Returns an ArrayIterator for this ArrayList to iterate through each element.
     * @return an ArrayIterator.
     */
    @Override
    public Iterator<Element> iterator() {
        return new ArrayIterator<>();       // create a new instance of the inner class.
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
        checkIndex(i, current_size + 1);

        for(int index = current_size; index > i; index--) {
            swap(container[index], container[index-1]);
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

    /**
     * Overrides the toString method to print all the elements in the list.
     * @return a String denoting all the elements in the list.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < current_size - 1; index++) {
            sb.append(container[index]).append(", ");
        }
        sb.append(container[current_size - 1]);
        return sb.toString();
    }

    // UNIT TEST STUB.
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>(20);

        // Test Case 1 --- size()
        System.out.println(test.size());

        // Test Case 2 --- isEmpty()
        System.out.println(test.isEmpty());

        // Test Case 3 --- add()
        System.out.println("Let's add some new elements in this list.");
        for(int index = 0; index < test.capacity; index++) {
            test.add(index, index);
        }
        System.out.println(test);
    }
}
