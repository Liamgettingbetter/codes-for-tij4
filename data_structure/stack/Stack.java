package data_structure.stack;

/**
 * The Stack interface.
 * @param <Element> type parameter for the element contained in the stack.
 */
public interface Stack<Element> {
    int size();
    int currentLength();
    boolean isEmpty();
    boolean isFull();
    void push(Element e);
    Element pop();
    Element top();
}

