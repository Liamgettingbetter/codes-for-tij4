package data_structure;

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

    @Override
    public boolean equals(Object obj) {
        super.equals(obj);
    }
}
