package initialization;

import java.util.Arrays;

/**
 * Created by Liam on 11/4/16.
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
            new Integer(1),
            new Integer(2),
            3,
        };

        Integer[] b = new Integer[]{
            new Integer(1),
            new Integer(2),
            3
        };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
