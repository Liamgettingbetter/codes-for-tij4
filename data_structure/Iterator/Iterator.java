package data_structure.Iterator;

/** A simple interface comprising the methods for moving to the next elements in the list. */
public interface Iterator<Element> {

    /** True if there's at least one additional element in the list, false otherwise. */
    boolean hasNext();

    /** Returns the next element in the list. */
    Element next();

    /** Removes the element that this iterator just passed. */
    void remove();
}
