package generics;

/**
 * Created by Liam on 22/02/2017.
 */
public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int size) {
        array = (T[])new Object[size];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    // Method that exposes the underlying representation
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai =
                new GenericArray<>(10);
        // This causes a ClassCastException
        // Integer[] ia = gai.rep();
        // This is Okay
        Object[] oa = gai.rep();
    }
}
