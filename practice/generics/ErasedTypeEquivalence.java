package practice.generics;

import java.util.ArrayList;

/**
 * Created by Liam on 18/02/2017.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);

    }
}
