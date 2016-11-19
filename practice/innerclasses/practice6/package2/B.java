package practice.innerclasses.practice6.package2;

import practice.innerclasses.practice6.package1.A;
import static java.lang.System.out;

/**
 * Created by Liam on 18/11/2016.
 */
public class B {
    protected class InnerB implements A {
        @Override
        public void f() {
            out.println("InnerB.f()");
        }
    }

    public InnerB returnInnerB() {
        return new InnerB();
    }
}
