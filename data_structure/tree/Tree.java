package data_structure.tree;

/** An interface for a tree where nodes can have an arbitrary number of children. */
public interface Tree<Element> extends Iterable<Element> {
    Element getElement();

    /* Get the root element in this tree structure. */
    Element root();

    /* Get the position of the parent of position p or null if p is the root. */

}
