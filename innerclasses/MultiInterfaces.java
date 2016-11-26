package innerclasses;

/**
 * Created by Liam on 20/11/2016.
 */
interface Z {}
interface ZZ {}

class X implements Z, ZZ {}
class Y implements Z {
    ZZ makeZZ() {
        // Anonymous inner class
        return new ZZ() {};
    }
}

public class MultiInterfaces {
    static void takesZ(Z z) {}
    static void takesZZ(ZZ zz) {}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        takesZ(x);
        takesZZ(x);
        takesZ(y);
        takesZZ(y.makeZZ());
    }
}
