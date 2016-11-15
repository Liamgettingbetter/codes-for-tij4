package initialization;

import java.util.Random;
import java.util.Arrays;
import static java.lang.System.out;

/**
 * Created by Liam on 11/4/16.
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ints = new Integer[rand.nextInt(20)];
        out.println("length of ints = " + ints.length);

        for(int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(500);
        }

        out.println(Arrays.toString(ints));
    }
}
