package math_problems;

/**
 * Created by Liam on 01/04/2017.
 */
interface A1 {
    void a();
}
interface B1 {
    void b();
}

interface C1 {
    void c();
}

class A2 implements A1 {
    @Override
    public void a() {
        System.out.println("A2.a()");
    }

}

class B2 implements B1 {
    @Override
    public void b() {
        System.out.println("B2.b()");
    }
}

class C2 implements C1 {
    @Override
    public void c() {
        System.out.println("C2.c()");
    }
}

class Mix extends A2 implements B1, C1 {
    private B1 bb = new B2();
    private C1 cc = new C2();

    @Override
    public void b() {
        bb.b();
    }

    @Override
    public void c() {
        cc.c();
    }
}

public class Test {
    Mix m1 = new Mix();
    Mix m2 = new Mix();

    // something's wrong.
//    m1.a();

}
