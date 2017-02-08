package practice.generics;

/**
 * Created by Liam on 08/02/2017.
 */


public class Practice2 {
    private static class Holder<T> {
        private T a;
        private T b;
        private T c;

        Holder(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        void set(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        T getA() {
            return this.a;
        }

        T getB() {
            return this.b;
        }

        T getC() {
            return this.c;
        }
    }
}
