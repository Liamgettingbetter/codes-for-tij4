package generics;

import java.util.*;

/**
 * Created by Liam on 11/03/2017.
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> f      = new ArrayList<>();
    static void f1() {
        writeExact(apples, new Apple());
        writeExact(f, new Apple()); // ?
    }
    static <T> void writeWithWildcard(List<? super T > list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(f, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}