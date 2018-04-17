package containers;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Liam on 07/04/2017.
 */
class StringAddress {
    private String s;

    public StringAddress(String a) {
        this.s = a;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(
            Collections.nCopies(4, new StringAddress("hello")));
        System.out.println(list);
        // Collections.fill(List<T>, T) 只能用于替换参数list中的内容
        // 并不能扩充list.
        Collections.fill(list, new StringAddress("World"));
        System.out.println(list);
    }
}