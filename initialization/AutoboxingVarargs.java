package initialization;

/**
 * Created by Liam on 11/4/16.
 */
public class AutoboxingVarargs {
    static void f(Integer... ints) {
        for(Integer i : ints)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(new Integer(1), new Integer(2));
        f(4, 5, 6, 7, 8, 9);
        f(10, new Integer(11));
    }
}
