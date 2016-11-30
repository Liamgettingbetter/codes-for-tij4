package holding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Collection;

/**
 * Created by Liam on 30/11/2016.
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs,
                "Take the long way home".split(" "));

        for(String s : cs)
            System.out.print("'" + s + "' ");
    }
}
