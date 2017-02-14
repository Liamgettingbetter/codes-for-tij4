package generics.tuple;

/**
 * Created by Liam on 14/02/2017.
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return Tuple.tuple("hi", 47);
    }

    static TwoTuple f2() {
        return Tuple.tuple("hi", 47);
    }

    static ThreeTuple<String, String, Integer> g() {
        return Tuple.tuple("Liam", "hi", 47);
    }

    static FourTuple<Float, String, String, Integer> h() {
        return Tuple.tuple(1.0f, "Lannister", "Debts", 47);
    }

    static FiveTuple<Double, Float, String, Integer, String> k() {
        return Tuple.tuple(6.66, 1.0f, "Lannister", 47, "Hi");
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ti = f();
        System.out.println(ti);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
