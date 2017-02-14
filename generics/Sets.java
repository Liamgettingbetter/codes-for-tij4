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
    }
}
