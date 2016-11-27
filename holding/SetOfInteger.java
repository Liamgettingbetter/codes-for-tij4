package holding;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

/**
 * Created by Liam on 27/11/2016.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();

        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.print(intset);
    }
}
