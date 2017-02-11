package practice.generics;

/**
 * Created by Liam on 11/02/2017.
 */
public class Practice10 {
    private static class GenericMethods {
        <A, B> void f(A a, B b, String s) {
            System.out.println(a.getClass().getName() + ", "
                + b.getClass().getName() + ", "
                + s.getClass().getName());
        }
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(1, 1.0f, "1");
        gm.f(gm, "1", "1");
        gm.f(true, gm, "1");
    }
}
