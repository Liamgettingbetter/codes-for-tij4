package practice.polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 12/11/2016.
 */
class Ego {
    void f() {
        out.println("Ego.f() & g()");
    }

    void g() {
        f();
    }
}

class Self extends Ego {
    @Override
    void g() {
        out.println("Self.f() & g()");
    }
}

public class Practice10 {
    public static void main(String[] args) {
        Ego e = new Self();
        e.g();
    }
}
