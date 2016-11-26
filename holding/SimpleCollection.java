package holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Liam on 23/11/2016.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            c.add(i);
        for(Integer i : c)
            System.out.print(i + " ");
    }
}
