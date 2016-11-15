package practice.interfaces;

import practice.interfaces.defaolt.*;

import static java.lang.System.out;

/**
 * Created by Liam on 14/11/2016.
 */
public class Practice5 implements Methods {
    @Override
    public void A() {
        out.println("A()");
    }

    @Override
    public void B() {
        out.println("B()");
    }

    @Override
    public void C() {
        out.println("C()");
    }

    public static void main(String[] args) {
        Practice5 n = new Practice5();
        n.A();
        n.B();
        n.C();
    }
}
