package data_structure.list;

public class CircularlyLinkedList<Elem> {

    private static class Node<Elem> {
        private Elem element;
        private Node<Elem> next;

        Node(Elem e, Node<Elem> n) {
            this.element = e;
            this.next = n;
        }

        Node() {
            this(null, null);
        }

        Node(Elem e) {
            this(e, null);
        }

        public Elem getElement() { return this.element; }

        public void setElement(Elem e) { this.element = e; }

        public Node<Elem> getNext() { return this.next; }

        public void setNext(Node<Elem> n) { this.next = n; }
    }

    // private Node<Elem> head = null;
    private Node<Elem> tail = null;
    private int size = 0;

    // CircularlyLinkedList() {}

    // access methods
    public int size() { return this.size; }
    public boolean isEmpty() { return size == 0; }

    public Elem first() {
        if(isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public Elem last() {
        if(isEmpty()) return null;
        return tail.getElement();
    }

    // update methods
    public void rotate() {
        if(tail != null) tail = tail.getNext();
    }

    public void addFirst(Elem e) {
        if(isEmpty()) {
            Node<Elem> temp = new Node<>(e, null);
            tail.setNext(temp);
        }
        else {
            Node<Elem> temp = new Node<>(e, tail.getNext());
            tail.setNext(temp);
        }
        size++;
    }

    public void addLast(Elem e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public Elem removeFirst() {
        if(isEmpty()) return null;
        Node<Elem> head = tail.getNext();
        if(head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    /**
     * Override Object.toString() method to define specific implementation.
     * @return a String representing the element list in String object.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node<Elem> temp = tail.getNext();
        while(temp != tail) {
            sb.append(temp.getElement()).append(", ");
        }
        sb.append(tail.getElement());
        return sb.toString();
    }

    // Unit Test
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list = new CircularlyLinkedList<>();
        System.out.println("Test whether circularly-linked list is empty : " + list.isEmpty());

        list.addFirst(12);
        // list.addLast(22);
        System.out.println("Add two integer numbers : " + list);

        System.out.println("The size of this cirlcularly-linked list is : " + list.size());

        System.out.println("The first element of this list is " + list.first());

        //System.out.println("The last element of this list is " + list.last());

        list.rotate();
        System.out.println("After rotation, the list becomes : " + list);

    }
}
