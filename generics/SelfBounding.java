package generics;

/**
 * Created by Liam on 29/03/2017.
 */
class SelfBounded<T extends SelfBounded<T>> {
    T element;
    SelfBounded<T> set(T arg) {
        this.element = arg;
        return this;
    }

    T get() {
        return this.element;
    }
}

class A extends SelfBounded<A> {}
class B extends SelfBounded<A> {}   // Also OK

class C extends SelfBounded<C> {
    C setAndGet(C arg) {
        set(arg);
        return get();
    }
}

class D {}
// You can not do this, 'cause D does not extend from SelfBounded class.
// class E extends SelfBounded<D> {}

// Alas, you can do this, so you can't force the idiom:
class F extends SelfBounded {}

public class SelfBounding {
    public static void main(String[] args) {
        A a = new A();
        a.set(new A());
        a = a.set(new A()).get();
        a = a.get();
        C c = new C();
        c = c.setAndGet(new C());
    }
}
