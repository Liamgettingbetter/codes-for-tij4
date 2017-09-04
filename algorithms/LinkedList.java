/**
	Linked List --- Java version
 */
package algorithms;

class Node {
	int value;
	Node next;

	Node() {
		this.value = -1;
		this.next = null;
	}

	Node(int value) {
		this.value = value;
		this.next = null;
	}

	@Override
    public String toString() {
	    return Integer.toString(this.value);
    }
}

public class LinkedList {
	private Node header;

	public LinkedList() {
		this.header = new Node();
	}

	public void add(Node next) {
		Node temp = header;

		while(temp.next != null) {
			temp = temp.next;
		}

		temp.next = next;
	}

	public void printList() {
	    Node temp = header.next;

	    System.out.print("[");

	    while(temp != null) {
	        System.out.print(temp);
	        temp = temp.next;

	        if(temp != null)
	            System.out.print(" ");
        }

        System.out.println("]");
    }

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		for(int i = 0; i < 100; i++) {
			list.add(new Node(i));
		}

		list.printList();

	}
}