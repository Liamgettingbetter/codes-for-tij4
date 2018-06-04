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

    /** Returns the number of levels separating Position p from the root. */
    public int depth(Position<Element> p) {
        if(isRoot(p)) return 0;
        else return 1 + depth(parent(p));
    }

    /** Returns the height of the subtree rooted at Position p. */
    public int height(Position<Element> p) {
        int height = 0;
        for(Position<Element> c : children(p))
            height = Math.max(height, 1 + height(c));
        return height;
    }
}
