package generics;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Liam on 28/03/2017.
 */
public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        for(int i = 0; i < 5; i++)
            li.add(i);

        for(int i : li)
            System.out.print(i + " ");
    }
}
