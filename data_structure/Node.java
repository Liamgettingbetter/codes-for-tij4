package data_structure;

/**
 * An general-purpose Node structure implementation.
 * @param <Element> parameterised type used to denote the element type.
 */
class Node<Element> implements Cloneable {

    private Element element;
    private Node<Element> next;

    Node() { this(null, null); }
    Node(Element e, Node<Element> n) {
        this.element = e;
        this.next = n;
    }

    public void setElement(Element new_elem) {
        this.element = new_elem;
    }

    public void setNext(Node<Element> new_next) {
        this.next = new_next;
    }

    public Element getElement() {
        return this.element;
    }

    public Node<Element> getNext() {
        return this.next;
    }

    @Override
    public String toString() {
        return element.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        Node<Element> result = new Node<>();
        result.element = this.element;
        result.next = (Node<Element>)this.next.clone();
        return result;
    }

//    public boolean equals(Node<Element> n) {
//        super.equals(n);
//
//
//    }
}
