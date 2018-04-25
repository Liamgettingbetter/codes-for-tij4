package data_structure;

/**
 * The Stack interface with
 * @param <Element>
 */
public interface Stack<Element> {
    int size();
    boolean isEmpty();
    void push(Element e);
    Element pop();
    Element top();
}

