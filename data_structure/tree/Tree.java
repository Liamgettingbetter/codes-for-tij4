package data_structure.tree;

import data_structure.iterator.Iterable;
import data_structure.iterator.Iterator;
import data_structure.position.Position;

/** An interface for a tree where nodes can have an arbitrary number of children. */
public interface Tree<Element> extends Iterable<Element>, Position<Element> {
    /** Returns the element stored at this position. */
    Element getElement();

    /** Get the root element in this tree structure. */
    Element root();

    /** Get the position of the parent of position p or null if p is the root. */
    Position<Element> parent(Position<Element> p);

    /** Returns an iterable collection containing the children of position p (if any). */
    Iterable<Element> children(Position<Element> p);

    /** Returns the number of children of position p. */
    int numChildren(Position<Element> c);

    // Query methods.
    /** Returns true if position p has at least one child. */
    boolean isInternal(Position<Element> p);

    /** Returns true if position p does not have any children. */
    boolean isExternal(Position<Element> p);

    /** Returns true if position p is the root of the tree. */
    boolean isRoot(Position<Element> p);

    // Some General Methods
    /** Returns the number of positions (and hence elements) that are contained in the tree. */
    int size();

    /** Returns true if the tree does not contain any positions (and thus no elements). */
    boolean isEmpty();

    /** Returns an iterator for all elements in the tree (so that the tree itself is Iterable). */
    Iterator<Element> iterator();

    /** */
}
