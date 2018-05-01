package data_structure;

public class ListBasedQueue<Element extends Cloneable> implements Queue<Element> {

    private static class Node<Element extends Cloneable> implements Cloneable {
        private Element element;
        private Node<Element> next;

        Node() { this(null, null); }
        Node(Element e, Node<Element> n) {
            this.element = e;
            this.next = n;
        }

        public void setElement(Element e) { this.element = e; }
        public void setNext(Node<Element> n) { this.next = n; }
        public Element getElement() { return this.element; }
        public Node<Element> getNext() { return this.next; }

        @Override
        @SuppressWarnings("unchecked")
        public Object clone() throws CloneNotSupportedException {
            super.clone();

            Node<Element> result = new Node<>();
            result.element = this.element;
            result.next = (Node<Element>)this.next.clone();
            return result;
        }
    }

    ListBasedQueue() { this.head = null; this.tail = null; this.size = 0; }

    private Node<Element> head;
    private Node<Element> tail;
    private int size;

    /**
     * Return the current number of elements in this queue.
     * @return the size of queue.
     */
    public int size() { return this.size; }

    /**
     * Check if current queue is empty.
     * @return true if queue is empty, false otherwise.
     */
    public boolean isEmpty() { return this.size == 0; }

    /**
     * Put a new Element into this queue.
     * @param elem element being inserted into this queue.
     */
    public void enqueue(Element elem) {
        if(isEmpty()) {
            Node<Element> temp = new Node<>(elem, tail);
            head.setNext(temp);
        }
        else {
            Node<Element> temp = new Node<>(elem, tail);
            Node<Element> index = head;
            while(index != tail) {
                index = index.getNext();
            }

        }
        size++;
    }

    /**
     * Return but not remove the first element in this queue.
     */
    public Element first() {
        return head.getElement();
    }

    /**
     * Remove the first element from the queue.
     */
    public Element dequeue() {
        if(isEmpty()) return null;
        else {
            Node<Element> temp = head;
            if(--size == 0) head = tail = null;
            
        }
    }


    public static void main(String[] args) {

    }
}
