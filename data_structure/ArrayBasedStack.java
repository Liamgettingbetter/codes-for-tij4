package data_structure;

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
        this(0);
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
     *
     * @return
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



    private void resize() {
        if(isFull()) {
            this.capacity *= 2;
            Element[] temp = this.stack;
            this.stack = (Element[])new Object[this.capacity];
        }
    }
}
