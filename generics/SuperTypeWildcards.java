package generics;

import java.util.*;

/**
 * Created by Liam on 11/03/2017.
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit());
    }
}