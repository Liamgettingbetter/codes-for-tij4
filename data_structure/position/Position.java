package data_structure.position;

public interface Position<Element> {

    /**
     * Returns the element stored at this position.
     * @return the stored element.
     * @throws IllegalStateException if position no longer valid.
     */
    Element getElement() throws IllegalStateException;
}
