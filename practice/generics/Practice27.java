package practice.generics;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Liam on 11/03/2017.
 */
public class Practice27 {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();
        // list.add(new Integer(1));
        list.add(null);
    }
}