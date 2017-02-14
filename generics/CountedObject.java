package generics;

/**
 * Created by Liam on 14/02/2017.
 */
public class CountedObject {
    private static long count = 0;
    private final long id = count++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
