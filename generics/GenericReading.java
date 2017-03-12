package generics;

import java.util.*;

/**
 * Created by Liam on 12/03/2017.
 */
public class GenericReading {
    static <T> T readExact(List<T> list) {
        return list.get(0);
    }

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit  = Arrays.asList(new Fruit());

    // a static method adapts to each call :
    static void f1() {
        Apple a = readExact(apples);
        Fruit f = readExact(fruit);
              f = readExact(apples);
    }

    // If, however, you have a class, then its type is
    // established when the class is instantiated.
    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }

    static void f2() {
        Reader<Fruit> fReader = new Reader<>();
        Fruit f = fReader.readExact(fruit);
        // Fruit a = fReader.readExact(apples);
    }

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }

    static void f3() {
        CovariantReader<Fruit> fReader =
                new CovariantReader<>();
        Fruit f = fReader.readCovariant(fruit);
        Fruit a = fReader.readCovariant(apples);
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }
}
