package initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Liam on 11/4/16.
 */
public class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int[] a = new int[rand.nextInt(20)];

        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
