package generics;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.List;

/**
 * Created by Liam on 29/03/2017.
 */
public class NeedCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
        List<Widget> shapes = (List<Widget>)in.readObject();
    }
}
