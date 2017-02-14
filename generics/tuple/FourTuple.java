package generics.tuple;

/**
 * Created by Liam on 14/02/2017.
 */
public class FourTuple<A, B, C, D> extends ThreeTuple {
    public final D d;

    FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d;
    }
}
