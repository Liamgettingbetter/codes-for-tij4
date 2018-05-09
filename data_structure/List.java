package data_structure;

/**
 * The List interface to be implemented.
 * @param <Element> parameterised type variable.
 * @author hao lei, May 9th, 2018
 */
public interface List<Element> {
    /** Return the size of this list. */
    int size();

    /** Check if this list is empty. */
    boolean isEmpty();

    /** Return the element in the position of i. */
    Element get(int i) throws IndexOutOfBoundsException;

    /** Set the specific element at the position of i, and return the replaced element. */
    Element set(Element new_element, int i) throws IndexOutOfBoundsException;

    /** Insert one element at position i, and shift all other elements after i. */
    void add(Element e, int i) throws IndexOutOfBoundsException;

    /** Remove one element at position i, and shift all elements before it. */
    Element remove(int i) throws IndexOutOfBoundsException;
}
