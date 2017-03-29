package generics;

/**
 * Created by Liam on 29/03/2017.
 */
class GenericSetter<T> {
    // Not self-bounded
    void set(T arg) {
        System.out.println("GenericSetter.set(base)");
    }
}

class DerivedGS extends GenericSetter<Base> {
    // Overload method
    void set(Derived derived) {
        System.out.println("DerivedGS.set(Derived)");
    }
}

public class PlainGenericInheritance {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS dgs = new DerivedGS();
        dgs.set(derived);
        dgs.set(base);
    }
}
