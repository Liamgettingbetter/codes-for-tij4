package practice.generics;

/**
 * Created by Liam on 11/02/2017.
 */
public class Practice9 {
    private static class GenericMethods {
        <A, B, C> void f(A a, B b, C c) {
            System.out.println(a.getClass().getName() + ", "
                + b.getClass().getName() + ", "
                +c.getClass().getName());
        }
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(1, 1.0f, "1");
        gm.f('a', "a", true);
        gm.f(gm, 1L, 1.0);
    }
}
