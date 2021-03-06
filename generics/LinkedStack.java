package generics;

/**
 * Created by Liam on 08/02/2017.
 */
public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            this.item = null;
            this.next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();    // End sentinel

    // end insert method.
    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> less = new LinkedStack<>();
        for(String s : "Phasers on stun!".split(" "))
            less.push(s);
        String s;
        while((s = less.pop()) != null)
            System.out.println(s);
    }
}
