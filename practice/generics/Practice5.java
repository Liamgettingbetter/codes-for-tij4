package practice.generics;

/**
 * Created by Liam on 08/02/2017.
 */
public class Practice5 {
    private static class LinkedStack<A> {
        private class Node {
            private A item;
            private Node next;

            Node() {
                this.item = null;
                this.next = null;
            }

            Node(A a, Node next) {
                this.item = a;
                this.next = next;
            }

            boolean end() {
                return this.item == null && this.next == null;
            }
        }

        private Node top = new Node();  // End sentinel

        public void push(A item) {
            top = new Node(item, top);
        }

        public A pop() {
            A temp = top.item;
            if(!top.end())
                top = top.next;
            return temp;
        }
    }

    public static void main(String[] args) {
        LinkedStack<String> lk = new LinkedStack<>();
        for(String s : "A Lannister always pays his debts".split(" "))
            lk.push(s);
        String s;
        while((s = lk.pop()) != null)
            System.out.println(s);
    }
}
