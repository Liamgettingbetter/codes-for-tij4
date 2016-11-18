package practice.innerclasses;

/**
 * Created by Liam on 18/11/2016.
 */
interface A {
    void a();
}

public class Practice9 {
    public A f() {
        class B implements A {
            @Override
            public void a() {
                System.out.println("f()->B.a()");
            }
        }
        return new B();
    }

    public static void main(String[] args) {
        Practice9 p = new Practice9();
        A a = p.f();
        a.a();  // polymorphism is used here.
    }
}
