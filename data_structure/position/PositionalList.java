package data_structure.position;

/** An interface for positional lists. */
public interface PositionalList<Element> {

    /** Returns the number of elements in the list. */
    int size();

    /** Tests whether the list is empty. */
    boolean isEmpty();

    /** Returns the first Position in the list (or null, if empty). */
    Position<Element> first();

    /** Returns the last Position in the list (or null, if empty). */
    Position<Element> last();

    /** Returns the position immediately before the Position p (or null, if p is root). */
    Position<Element> before(Position<Element> p) throws IllegalArgumentException;

    /** Returns the position immediately after the Position p (or null, if p is last). */
    Position<Element> after(Position<Element> p) throws IllegalArgumentException;

    /** Inserts element e at the front of the list and returns its new Position. */
    Position<Element> addFirst(Element e);

    /** Inserts element e at the back of the list and returns its new Position. */
    Position<Element> addLast(Element e);

    /** Inserts element e immediately before the Position p and returns its new Position. */
    Position<Element> addBefore(Position<Element> p, Element e) throws IllegalArgumentException;

    /** Inserts element e immediately after the Position p and returns its new Position. */
    Position<Element> addAfter(Position<Element> p, Element e) throws IllegalArgumentException;

    /** Replaces the element stored at Position p and returns the replaced element. */
    Element set(Position<Element> p, Element e) throws IllegalArgumentException;

    /** Removes the element stored at Position p and returns it (invalidating p). */
    Element remove(Position<Element> e) throws IllegalArgumentException;

}
