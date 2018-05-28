package data_structure.stack;

import data_structure.stack.Stack;

/**
 * The implementation of linked-list based stack, and the distinct feature of which
 * is that it has no need to provide resize() method, because there is no original capacity
 * for this implementation.
 * @param <Element> the element to be contained in this stack.
 * @author Hao Lei, Apr 29, 2018
 */
public abstract class ListBasedStack<Element> implements Stack<Element> {

    private static class Node<Element> {
        private Element element;
        private Node<Element> next;

        Node() { this(null, null); }
        Node(Element e, Node<Element> n) { this.element = e; this.next = n; }

        public void setElement(Element e) { this.element = e; }
        public void setNext(Node<Element> n) { this.next = n; }

        public Element getElement() { return this.element; }
        public Node<Element> getNext() { return this.next; }
    }

    private Node<Element> head;

    ListBasedStack() { head = null; }

//    @Override
//    public int size() {}


}
