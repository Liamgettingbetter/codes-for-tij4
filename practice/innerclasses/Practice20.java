package practice.innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
interface NestI {
    void f();

    class Nested implements NestI {
        @Override
        public void f() {
            System.out.println("Hello World.");
        }
    }
}

public class Practice20 {
    public static void main(String[] args) {
        NestI.Nested n = new NestI.Nested();
        n.f();
    }
}
