package holding;

import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Liam on 01/12/2016.
 */
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = new ArrayList<>(Arrays.asList(ia));

        System.out.println("Before shuffling : " + list);
        Collections.shuffle(list, rand);
        System.out.println("After shuffling : " + list);
        System.out.println("array: " + Arrays.toString(ia));

        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("Before shuffling : " + list2);
        Collections.shuffle(list2, rand);
        System.out.println("After shuffling : " + list2);
        System.out.println("array : " + Arrays.toString(ia));
    }
}
