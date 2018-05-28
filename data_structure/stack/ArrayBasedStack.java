package data_structure.stack;

import java.util.Arrays;

public class ArrayBasedStack<Element> implements Stack<Element>, Cloneable {
    private int capacity;
    private int length;
    private Element[] stack;

    ArrayBasedStack(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.stack = (Element[])new Object[capacity];
    }

    ArrayBasedStack() {
        this(10);
    }

    @Override
    public int size() {
        return this.capacity;
    }

    @Override
    public int currentLength() {
        return this.length;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    /**
     * Check whether current stack is full or not.
     * @return boolean true/false.
     */
    @Override
    public boolean isFull() {
        return this.length == this.capacity;
    }

    /**
     * Push an element into the stack,
     * and add the length of current stack size with one.
     * @param e element to be put into stack.
     */
    @Override
    public void push(Element e) {
        if(!isFull())
            this.stack[length++] = e;
        else {
            resize();
            this.stack[length++] = e;
        }
    }

    /**
     * Pop out the top element in this stack,
     * then remove the underlying element of stack data structure.
     * @return Element e, the top element.
     */
    @Override
    public Element pop() {
        if(!isEmpty()) {
            Element temp = stack[--length];
            stack[length] = null;
            return temp;
        }
        return null;
    }

    @Override
    public Element top() {
        if(!isEmpty())
            return stack[--length];
        return null;
    }

    @Override
    public Object clone() {
        Object ret = new ArrayBasedStack<Element>(this.capacity);
        ((ArrayBasedStack) ret).length = this.length;

        for(Object e : this.stack) {
            ((ArrayBasedStack) ret).push(e);
        }
        return ret;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Element e : stack) {
            sb.append(e).append(", ");
        }

        return sb.toString();
    }


    private void resize() {
        this.capacity *= 2;
        Element[] temp = this.stack;
        this.stack = (Element[])new Object[this.capacity];

        for(int i = 0; i < temp.length; i++) {
            stack[i] = temp[i];
        }
    }

    /**
     * Using an inner stack structure to reverse an array.
     * @param a an array with parameterised type.
     * @param <Element> the parameterised type.
     */
    public static <Element> void reverse(Element[] a) {
        Stack<Element> s = new ArrayBasedStack<>(a.length);
        for(int i = 0; i < a.length; i++) {
            s.push(a[i]);
        }

        for(int i = 0; i < a.length; i++)
            a[i] = s.pop();
    }

    // Unit Test
    public static void main(String[] args) {
        System.out.println("Test for Stack structure.");
        Stack<Integer> s = new ArrayBasedStack<>();

        for(int index = 0; index < 10; index++) {
            s.push(index);
        }
        System.out.println("Just print out the contents in structure.");
        System.out.println(s);

        s.pop();
        s.push(100);
        System.out.println("Print the stack");
        System.out.println(s);

        Integer[] temp = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        reverse(temp);
        System.out.println(Arrays.toString(temp));
    }
}
