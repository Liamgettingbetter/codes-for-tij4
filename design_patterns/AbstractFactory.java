package design_patterns;

/**
 * Created by Liam on 31/03/2017.
 */
interface Factory2 {
    Object create();
}

class A {}
class B {}

class AFactory implements Factory2 {
    @Override
    public A create() {
        return new A();
    }
}

class BFactory implements Factory2 {
    @Override
    public B create() {
        return new B();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        AFactory af = new AFactory();
        BFactory bf = new BFactory();

        A a = af.create();
        B b = bf.create();
    }
}
