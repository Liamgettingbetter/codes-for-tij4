package practice.generics;

/**
 * Created by Liam on 19/02/2017.
 */
interface A {
    void f();
    void g();
}

class B implements A {
    @Override
    public void f() {
        System.out.println("B.f()");
    }

    @Override
    public void g() {
        System.out.println("B.g()");
    }

    public void h() {
        System.out.println("B.h()");
    }
}

class C {
    <T extends A> void d(T t) {
        t.f();
        t.g();
    }
}

public class Practice20 {
    public static void main(String[] args) {
        C c = new C();
        c.d(new B());
        c.d(new A(){
            @Override
            public void f() {
                System.out.println("A.f()");
            }

            @Override
            public void g() {
                System.out.println("A.g()");
            }
        });
    }
}
