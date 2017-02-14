package generics;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by Liam on 14/02/2017.
 */
public class Sets {
    public static <T> Set<T> union(Set a, Set b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
