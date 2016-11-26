package innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
interface A {
    void a();
}

interface B {
    void b();
}


public class Test {
    private class L implements A, B {
        @Override
        public void a() {
            System.out.println("Test.L.a()");
        }

        @Override
        public void b() {
            System.out.println("Test.L.b()");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        L l = t.new L();
        l.a();
        l.b();
    }
}
