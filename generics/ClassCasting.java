package generics;

import java.util.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by Liam on 29/03/2017.
 */
public class ClassCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));

        // Won't compile
        // List<Widget> lw1 = List<Widget>.class.cast(in.readObject());
        List<Widget> lw2 = List.class.cast(in.readObject());
    }
}