package generics.tuple;

/**
 * Created by Liam on 14/02/2017.
 */
public class FiveTuple<A,B,C,D,E> extends FourTuple {
    public final E e;

    FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.e = e;
    }
}
