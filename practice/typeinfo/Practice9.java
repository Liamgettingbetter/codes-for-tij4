package practice.typeinfo;

import java.lang.reflect.Field;

/**
 * Created by Liam on 09/01/2017.
 */
public class Practice9 {
    private static class A {
        private int number;
        private char chars;
    }

    private static class B extends A {
        private int B;
    }

    private static class C extends B {
        private int C;
    }

    private static class D extends C {
        private int D;
    }

    private static class E extends D {
        private int E;
    }

    static void print(Class c) {
        for(Field f : c.getDeclaredFields())
            System.out.println(f);
        if(c.getName().equals("java.lang.Object"))
            return;
        print(c.getSuperclass());
    }

    public static void main(String[] args) {
        print(new E().getClass());
    }
}
