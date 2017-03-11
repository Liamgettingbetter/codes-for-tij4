package generics;

import java.util.*;

/**
 * Created by Liam on 11/03/2017.
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> list =
                Arrays.asList(new Apple());
        Apple a = (Apple)list.get(0);
        list.contains(new Apple()); // Argument is 'Object'
        list.indexOf(new Apple());  // Argument is 'Object'
    }
}
