package reusing;

/**
 * Created by Liam on 11/10/16.
 */
class Gizmo {
    public void spin() {}
}

public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gizmo(); --- g is final, can not refer to another object
    }

    void without(Gizmo g) {
        g = new Gizmo();    // OK --- g is not final
        g.spin();
    }

    //! void f(final int i) { i++; }
    // You can only read from a final primitive
    int g(final int i) { return i + 1; }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
