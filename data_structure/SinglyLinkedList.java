package data_structure;

/**
 *  Create an abstract data type for classic data
 *      structure of singly-linked list.
 *  version 1.0
 *  time --- Apr 21st 2018
 */
public class SinglyLinkedList<Elem> {

    private static class Node<Elem> {
        private Elem element;
        private Node<Elem> next;

        Node() { this(null, null); }
        Node(Elem e) { this(e, null); }
        Node(Elem e, Node<Elem> n) { element = e; next = n; }

        public Elem getElement() { return this.element; }
        public Node<Elem> getNext() { return this.next; }
        public void setNext(Node<Elem> next) { this.next = next; }
    }

    private Node<Elem> head = null;
    private Node<Elem> tail = null;
    private int size = 0;

    SinglyLinkedList() {}

    // access methods
    public int size() { return this.size; }
    public boolean isEmpty() { return size == 0; }

    // returns the first element.
    public Elem first() {
        if(isEmpty()) return null;
        return head.getElement();
    }

    public Elem last() {
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(Elem first) {
        head = new Node<>(first, head);
        if(isEmpty()) tail = head;
        size++;
    }

    public void addLast(Elem last) {
        Node<Elem> temp = new Node<>(last, null);
        if(isEmpty()) head = temp;
        else tail.setNext(temp);
        tail = temp;
        size++;
    }

    public Elem removeFirst() {
        if(isEmpty()) return null;
        Node<Elem> temp = head;
        head = head.getNext();
        size--;
        if(isEmpty()) tail = null;
        return temp.getElement();
    }
}
