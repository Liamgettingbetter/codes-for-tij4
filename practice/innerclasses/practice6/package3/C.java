package practice.innerclasses.practice6.package3;

import practice.innerclasses.practice6.package1.A;
import practice.innerclasses.practice6.package2.B;

/**
 * Created by Liam on 18/11/2016.
 */
public class C extends B {
    A inner() {
        // B b = new B();
        return (A)(returnInnerB());
    }

    public static void main(String[] args) {
        //A a = new C().inner();
    }
}
