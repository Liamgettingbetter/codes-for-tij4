package holding;

import java.util.Arrays;

/**
 * Created by Liam on 30/11/2016.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for(T it : ib)
            System.out.print(it + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = { "A", "B", "C " };
        // An array works in foreach but it's not Iterable
        // test(strings);
        // You must explicitly convert it to an Iterable
        test(Arrays.asList(strings));
    }
}
