package practice.interfaces;

/**
 * Created by Liam on 15/11/2016.
 */
interface A {
    void a();
}

interface B extends A {
    void b();
}

interface C extends A {
    void c();
}

interface D extends B, C {
    void d();
}

public class Practice13 {
}
