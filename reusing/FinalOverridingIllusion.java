package reusing;

import static java.lang.System.out;

/**
 * Created by Liam on 11/10/16.
 */
class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        out.println("WithFinals.f()");
    }

    // Also automatically final :
    private void g() { out.println("WithFinals.g()"); }
}

class OverridePrivate extends WithFinals {
    private void f() {
        out.println("OverridePrivate.f()");
    }

    private void g() {
        out.println("OverridePrivate.g()");
    }
}

class OverridePrivate2 extends OverridePrivate {
    public final void f() {
        out.println("OverridePrivate2.f()");
    }

    public void g() {
        out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridePrivate2 op2 = new OverridePrivate2();
        op2.f();
        op2.g();
        // You can upcast :
        OverridePrivate op = op2;
        // But you cannot call the methods :
        //! op.f();
        //! op.g();
        // Same here :
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();
    }
}
