package algorithms;

/**
 * Created by Liam on 31/08/2017.
 */
class Node {
    int value;
    Node next;

    Node() {
        this.value = 0;
        this.next = null;
    }

    Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

public class LinkedList {
    private Node header;

    private LinkedList() {
        this.header = new Node(-1);
    }

    public void add(Node newNode) {
        Node temp = this.header;

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node temp = this.header;

        System.out.print("[");

        while(temp.next.next != null) {
            temp = temp.next;
            System.out.print(temp + " ");
        }
        temp = temp.next;
        System.out.println(temp + "]");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for(int i = 0; i < 100; i++) {
            list.add(new Node(i));
        }

        list.printList();
    }
}
