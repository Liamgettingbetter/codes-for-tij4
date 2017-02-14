package generics.tuple;

/**
 * Created by Liam on 14/02/2017.
 */
public class ThreeTuple<A, B, C> extends TwoTuple {
    public final C c;

    ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }
}
