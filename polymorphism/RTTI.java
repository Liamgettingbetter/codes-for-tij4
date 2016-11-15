package polymorphism;

/**
 * Created by Liam on 13/11/2016.
 */
class Useful {
    void f() {}
    void g() {}
}

class MoreUseful extends Useful {
    @Override void f() {}
    @Override void g() {}
    void u() {}
    void v() {}
    void w() {}
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] a = {
            new Useful(),
            new MoreUseful(),
        };

        a[0].f();
        a[1].g();
        // a[1].u();  --- Compile time error : Useful does not have method u()
        ((MoreUseful)a[1]).u(); // Downcast RTTI
        // ((MoreUseful)a[0].u());
    }
}
