package generics;

/**
 * Created by Liam on 29/03/2017.
 */
class OrdinarySetter {
    void set(Base base) {
        System.out.println("OrdinarySetter.set(base)");
    }
}

class DerivedSetter extends OrdinarySetter {
    // It is a overload method with a same name but a different parameter.
    void set(Derived derived) {
        System.out.println("DerivedSetter.set(derived)");
    }
}

public class OrdinaryArguments {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter ds = new DerivedSetter();
        ds.set(derived);
        ds.set(base);
    }
}
