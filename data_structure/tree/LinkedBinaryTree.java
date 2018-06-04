package data_structure.tree;

import data_structure.position.Position;

/** Concrete implementation of a binary tree using a node-based linked structure. */
public class LinkedBinaryTree<Element> extends AbstractBinaryTree<Element> {

    // nested Node class
    protected static class Node<Element> implements Position<Element> {
        private Element element;                    // an element stored at this node
        private Node<Element> parent;           // a reference to the parent node (if any)
        private Node<Element> left_child;       // a reference to the left child (if any)
        private Node<Element> right_child;      // a reference to the right child (if any)

        /** Constructs a node with the given element and neighbors. */
        public Node(Element elem, Node<Element> p, Node<Element> l_c, Node<Element> r_c) {
            this.element = elem;
            this.parent = p;
            this.left_child = l_c;
            this.right_child = r_c;
        }

        // accessor methods
        @Override
        public Element getElement() { return this.element; }

        public Node<Element> getParent() { return this.parent; }
        public Node<Element> getLeft() { return this.left_child; }
        public Node<Element> getRight() { return this.right_child; }

        // update methods
        public void setElement(Element e) { this.element = e; }
        public void setParent(Node<Element> parent) { this.parent = parent; }
        public void setLeft(Node<Element> left) { this.left_child = left; }
        public void setRight(Node<Element> right) { this.right_child = right; }
    }

    /** Factory function to create a new node storing element e. */
    protected Node<Element> createNode(Element e, Node<Element> parent, Node<Element> l, Node<Element> r) {
        return new Node<Element>(e, parent, l, r);
    }

    
}
