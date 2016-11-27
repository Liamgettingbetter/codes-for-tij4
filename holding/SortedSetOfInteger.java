package holding;

import java.util.Random;
import java.util.TreeSet;
import java.util.SortedSet;

/**
 * Created by Liam on 27/11/2016.
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<>();

        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.print(intset);
    }
}
