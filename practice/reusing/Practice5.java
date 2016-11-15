package practice.reusing;

/**
 * Created by Liam on 11/9/16.
 */
class A {
    A() {
        System.out.println("A()");
    }
}

class B {
    B() {
        System.out.println("B()");
    }
}

class C extends A {
    private B b = new B();

    {
        System.out.println("C()");
    }
}

public class Practice5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
