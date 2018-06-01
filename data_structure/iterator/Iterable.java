package data_structure.iterator;

/** An interface for iterating through all the elements in a container. */
public interface Iterable<Element> {

    /** Returns an iterator of the elements in the collection. */
    Iterator<Element> iterator();
}
