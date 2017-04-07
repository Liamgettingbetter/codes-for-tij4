package containers;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Liam on 07/04/2017.
 */
class StringAddresses {
    private String s;

    public StringAddresses(String s) { this.s = s; }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddresses> list = new ArrayList<>(
            Collections.nCopies(4, new StringAddresses("Fuck"))
        );
        System.out.println(list);

        Collections.fill(list, new StringAddresses("Fuck you"));
        System.out.println(list);
    }
}
