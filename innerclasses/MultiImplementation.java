package innerclasses;

/**
 * Created by Liam on 20/11/2016.
 */
class D {}
abstract class E {}

// achieve multi-extends from two classes(abstract classes)
// via anonymous inner class
class ZZZ extends D {
    E makeE() {
        return new E() {};
    }
}

public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        ZZZ z3 = new ZZZ();
        takesD(z3);
        takesE(z3.makeE());
    }
}
