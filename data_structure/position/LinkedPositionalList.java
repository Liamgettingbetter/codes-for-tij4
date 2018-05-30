package data_structure.position;

public class LinkedPositionalList<Element> implements PositionalList<Element> {

    // Nested Node class for the doubly-linked list.
    private static class Node<Element> implements Position<Element> {
        private Element element;        // reference to the element stored at this node
        private Node<Element> prev;     // reference to the previous node in the list.
        private Node<Element> next;     // reference to the subsequent node in the list.

        // Customized constructor
        public Node(Element elem, Node<Element> prev, Node<Element> next) {
            this.element = elem;
            this.prev = prev;
            this.next = next;
        }

        /**
         * Implement the method in the interface Position
         * which returns the element stored at this position.
         * @return the stored element.
         * @throws IllegalStateException if position no longer valid.
         */
        public Element getElement() throws IllegalStateException {
            if(next == null)
                throw new IllegalStateException("Position no longer valid.");
            return element;
        }

        // Bundles for setter and getter methods.
        public Node<Element> getPrev() { return this.prev; }

        public Node<Element> getNext() { return this.next; }

        public void setElement(Element e) { this.element = e; }

        public void setPrev(Node<Element> prev) { this.prev = prev; }

        public void setNext(Node<Element> next) { this.next = next; }
    }

    // instance variables of the LinkedPositionalList
    private Node<Element> header;       // header sentinel
    private Node<Element> trailer;      // trailer sentinel
    private int size = 0;               // number of elements in the list

    /** Constructs a new empty list. */
    public LinkedPositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    // Private Utilities

    /** Validates the position and returns it as a node. */
    private Node<Element> validate(Position<Element> p) throws IllegalArgumentException {
        if(!(p instanceof Node)) throw new IllegalArgumentException("Invalid position variable.");
        Node<Element> node = (Node<Element>)p;
        if(node.getNext() == null) throw new IllegalArgumentException("p is no longer in the list.");
        return node;
    }

    /** Returns a given node as a Position (or null, if it is a sentinel). */
    private Position<Element> position(Node<Element> node) {
        if(node == header || node == trailer) return null;
        return node;        // automatically upcast to Position object.
    }

    // Public Accessor methods

    /** Returns the number of elements in the linked list. */
    @Override
    public int size() { return this.size; }

    /** Tests whether the linked list is empty. */
    @Override
    public boolean isEmpty() { return this.size == 0; }

    /** Returns the first position in the linked list (or null, if empty). */
    @Override
    public Position<Element> first() {
        return position(header.getNext());
    }

    /** Returns the last position in the linked list (or null, if empty). */
    @Override
    public Position<Element> last() {
        return position(trailer.getPrev());
    }

    /** Returns the Position immediately before Position p (or null, if p is first). */
    @Override
    public Position<Element> before(Position<Element> p) throws IllegalArgumentException {
        Node<Element> node = validate(p);
        return position(node.getPrev());
    }

    /** Returns the Position immediately after Position p (or null, if p is last). */
    @Override
    public Position<Element> after(Position<Element> p) throws IllegalArgumentException {
        Node<Element> node = validate(p);
        return position(node.getNext());
    }

    // Private Utilities

    /** Adds element e to the linked list between the given nodes. */
    private Position<Element> addBetween(Element e, Node<Element> pred, Node<Element> succ) {
        Node<Element> newest = new Node<>(e, pred, succ);
        pred.setNext(newest);
        succ.setPrev(newest);
        this.size++;
        return position(newest);
    }

    // public update methods
    /** Inserts element e at the front of the linked list and returns its new Position. */
    @Override
    public Position<Element> addFirst(Element e) {
        return addBetween(e, header, header.getNext());
    }

    /** Inserts element e at the back of the linked list and returns its new Position. */
    @Override
    public Position<Element> addLast(Element e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }

    /** Inserts element e immediately before Position p, and returns its new Position. */
    @Override
    public Position<Element> addBefore(Position<Element> p, Element e) throws IllegalArgumentException {
        Node<Element> node = validate(p);
        return addBetween(e, node.getPrev(), node);
    }

    /** Inserts element e immediately after Position p, and returns its new Position. */
    @Override
    public Position<Element> addAfter(Position<Element> p, Element e) throws IllegalArgumentException {
        Node<Element> node = validate(p);
        return addBetween(e, node, node.getNext());
    }

    /** Inserts element e immediately after Position p, and returns the replaced element. */
    @Override
    public Element set(Position<Element> p, Element e) throws IllegalArgumentException {
        Node<Element> node = validate(p);
        Element answer = node.getElement();
        node.setElement(e);
        return answer;
    }

    /** Removes the element stored at Position p and returns it (invalidating p). */
    @Override
    public Element remove(Position<Element> p) throws IllegalArgumentException {
        Node<Element> node = validate(p);
        Node<Element> predecessor = node.getPrev();
        Node<Element> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        this.size--;
        Element result = node.getElement();
        node.setElement(null);
        node.setPrev(null);
        node.setNext(null);
        return result;
    }

    /**
     * Override toString() method in the base Object class.
     * @return a String denoting all the elements in this LinkedPositionalList.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<Element> iterator = header.getNext();
        while(iterator != trailer.getPrev()) {
            sb.append(iterator.getElement()).append(", ");
            iterator = iterator.getNext();
        }
        sb.append(iterator.getElement()).append("\n");
        return sb.toString();
    }

    // Unit Test
    public static void main(String[] args) {
        System.out.println("Create an LinkedPositionalList container object with Integers in it.");
        LinkedPositionalList<Integer> test = new LinkedPositionalList<>();

        // Test case 1 --- size()
        System.out.println("The size of this list : " + test.size());

        // Test case 2 --- isEmpty()
        System.out.println("Is the list an empty list : " + test.isEmpty());

        // Test case 3 --- addFirst()
        System.out.println("First, let's add 10 integer element into this list.");
        for(int index = 0; index < 10; index++) {
            test.addFirst(index);
        }
        System.out.println("The list elements are " + test);
    }
}