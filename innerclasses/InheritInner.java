package innerclasses;

/**
 * Created by Liam on 22/11/2016.
 */
class WithInner {
    class Inner {}
}

public class InheritInner extends WithInner.Inner {
    // InheritInner() {}
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
