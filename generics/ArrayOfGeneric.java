package generics;

interface Generic<T> {}

/**
 * Created by Liam on 21/02/2017.
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer> gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //gia = (Generic<Integer>[])new Object[SIZE];
        // Runtime type is the raw(erased) type :
        //gia = (Generic<Integer>[])new Generic[SIZE];
    }
}
