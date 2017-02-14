package practice.generics;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import generics.coffee.*;

/**
 * Created by Liam on 14/02/2017.
 */
public class Practice13 {
    public static <T> List<T> fill(
        List<T> l, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            l.add(gen.next());
        return l;
    }

    public static <T> LinkedList<T> fill(
        LinkedList<T> l, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            l.add(gen.next());
        return l;
    }

    public static <T> Set<T> fill(
        Set<T> set, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            set.add(gen.next());
        return set;
    }
}
