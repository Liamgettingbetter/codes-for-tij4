package generics;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Liam on 11/03/2017.
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        // Wildcards allow covariance
        List<? extends Fruit> flist = new ArrayList<>();
        // Compile error : Can't add any type of object.
        // flist.add(new Apple());
        // flist.add(new Orange());
        // flist.add(new Fruit());
        flist.add(null);    // Legal but uninteresting
        // We know that it returns at least Fruit.
        Fruit f = flist.get(0);
    }
}
