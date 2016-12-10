package strings;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Liam on 10/12/2016.
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        return " InfiniteRecursion address : " + this + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<>();

        for(int i = 0; i < 10; i++)
            list.add(new InfiniteRecursion());
        System.out.println(list);
    }
}
