package data_structure;

public class DoublyLinkedList<Element> implements Cloneable {

    private static class Node<Element> implements Cloneable {
        private Node<Element> prev;
        private Element content;
        private Node<Element> next;

        Node() { this(null, null, null); }
        Node(Element elem) { this(null, elem, null); }
        Node(Node<Element> p, Element e, Node<Element> n) {
            this.prev = p;
            this.content = e;
            this.next = n;
        }

        public Element getContent() { return this.content; }
        public Node<Element> getPreNode() { return this.prev; }
        public Node<Element> getNextNode() { return this.next; }

        public void setContent(Element e) { this.content = e; }
        public void setPrevNode(Node<Element> prev) { this.prev = prev; }
        public void setNextNode(Node<Element> next) { this.next = next; }

        // equality method overloads.
        public boolean equals(Node<Element> list) {
            if(super.equals(list)) return true;
            else {
                return this.prev.equals(list) && this.content.equals(list.content)
                        && this.next.equals(list.next);
            }
        }

//        @Override
//        public Node<Element> clone() throws CloneNotSupportedException {
//
//        }
    }

    private Node<Element> header = null;
    private Node<Element> trailer = null;
    private int size = 0;

    DoublyLinkedList() {
        header = new Node<>();
        trailer = new Node<>();
    }


    // get the size of this Doubly Linked List.
    public int size() { return this.size; }

    // check whether this Doubly Linked List is empty.
    public boolean isEmpty() { return size == 0; }

    // get the element of the first node in this list.
    public Element first() {
        if(isEmpty()) return null;
        else return header.getNextNode().getContent();
    }

    // get the element of the last node in this list.
    public Element last() {
        if(isEmpty()) return null;
        else return trailer.getPreNode().getContent();
    }

    public void addFirst(Element e) {
        if(isEmpty()) {
            addIfEmpty(e);
        }
        else {
            Node<Element> new_node = new Node<>(header, e, header.getNextNode());
            header.setNextNode(new_node);
            new_node.getNextNode().setPrevNode(new_node);
        }
        size++;
    }

    public void addLast(Element e) {
        if(isEmpty()) {
            addIfEmpty(e);
        }
        else {
            Node<Element> new_node = new Node<>(trailer.getPreNode(), e, trailer);
            trailer.setPrevNode(new_node);
            new_node.getPreNode().setNextNode(new_node);
        }
        size++;
    }

    public Element removeFirst() {
        if(isEmpty()) return null;
        else {
            Node<Element> temp = header.getNextNode();
            temp.setPrevNode(null);
            header.setNextNode(temp.getNextNode());
            temp.setNextNode(null);
            header.getNextNode().setPrevNode(header);
            if(--size == 0) {
                header = null;
                trailer = null;
            }
            return temp.getContent();
        }
    }

    public Element removeLast() {
        if(isEmpty()) return null;
        else {
            Node<Element> temp = trailer.getPreNode();
            temp.setNextNode(null);
            trailer.setPrevNode(temp.getPreNode());
            temp.setPrevNode(null);
            if(--size == 0) {
                header = null;
                trailer = null;
            }
            return temp.getContent();
        }
    }

    private void addIfEmpty(Element e) {
        //header = new Node<>();
        //trailer = new Node<>();
        Node<Element> new_node = new Node<>(header, e, trailer);

        header.setNextNode(new_node);
        trailer.setPrevNode(new_node);
    }

    @Override
    public String toString() {
        // System.out.print("This doubly-linked list contains : ");
        StringBuilder sb = new StringBuilder();

        if(header == trailer) {
            sb.append("null");
        }
        else {
            Node<Element> pointer = header.getNextNode();
            while (pointer != trailer) {
                sb.append(pointer.getContent()).append(", ");
                pointer = pointer.getNextNode();
            }
        }
        return sb.toString();
    }


    // overloaded equality test method.
    public boolean equals(DoublyLinkedList<Element> list) {
        if(super.equals(list)) return true;
        else {
            if(this.size != list.size) return false;
            else {
                Node<Element> temp = header.getNextNode();
                Node<Element> other_temp = list.header.getNextNode();
                while (temp != last() && other_temp != list.last()) {
                    if(!temp.getPreNode().equals(other_temp.getPreNode())
                            || !temp.getContent().equals(other_temp.getContent())
                            || !temp.getNextNode().equals(other_temp.getNextNode()))
                        return false;
                    temp = temp.getNextNode();
                    other_temp = other_temp.getNextNode();
                }
                return true;
            }
        }
    }

//    public Object clone(DoublyLinkedList<Element> list) {
//
//    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        System.out.println("Test whether this list is empty : " + list.isEmpty());
        System.out.println("Add some integers in this list.");
        list.addFirst(12);
        list.addLast(24);
        System.out.println("This doubly-linked list contains : " + list);
        list.removeFirst();
        System.out.println("After removing the first node, this list is " + list);
        list.removeLast();
        System.out.println("After removing the last node, this list is " + list);
    }
}
