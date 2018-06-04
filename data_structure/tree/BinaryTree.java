package data_structure.tree;

import data_structure.position.Position;

public interface BinaryTree<Element> extends Tree<Element> {

    /** Returns the position of the left child of p (or null if p has no left child). */
    Position<Element> left(Position<Element> p) throws IllegalArgumentException;

    /** Returns the position of the right child of p (or null if p has no right child). */
    Position<Element> right(Position<Element> p) throws IllegalArgumentException;

    /** Returns the position of the siblings of p (or null if p has no sibling). */
    Position<Element> sibling(Position<Element> p) throws IllegalArgumentException;
}
