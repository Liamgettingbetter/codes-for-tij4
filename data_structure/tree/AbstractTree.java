package data_structure.tree;

import data_structure.position.Position;

/** An abstract base class providing some functionality of the Tree interface. */
public abstract class AbstractTree<Element> implements Tree<Element> {

    @Override
    public boolean isInternal(Position<Element> p) { return numChildren(p) > 0; }

    @Override
    public boolean isExternal(Position<Element> p) { return numChildren(p) == 0; }

    @Override
    public boolean isRoot(Position<Element> p) { return p == root(); }

    @Override
    public boolean isEmpty() { return size() == 0; }
}
