package data_structure.tree;

import data_structure.iterator.Iterable;
import data_structure.position.Position;

import java.util.ArrayList;
import java.util.List;

public class AbstractBinaryTree<Element> extends AbstractTree<Element> implements BinaryTree<Element> {

    /** Returns the Position of p's sibling (or null if no sibling exists.) */
    @Override
    public Position<Element> sibling(Position<Element> p) {
        Position<Element> parent = parent(p);
        if(parent == null) return null;         // if p is the root.
        if(p == left(parent))
            return right(parent);
        else
            return left(parent);
    }

    /** Returns the number of children of Position p. */
    @Override
    public int numChildren(Position<Element> p) {
        int count = 0;
        if(left(p) != null) count++;
        if(right(p) != null) count++;
        return count;
    }

    /** Returns an iterable collection of the Positions representing p's children. */
    @Override
    public Iterable<Position<Element>> children(Position<Element> p) {
        List<Position<Element>> snapshot = new ArrayList<>(2);
        if(left(p) != null)
            snapshot.add(left(p));
        if(right(p) != null)
            snapshot.add(right(p));
        return snapshot;
    }

}
