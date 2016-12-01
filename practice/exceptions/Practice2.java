package practice.exceptions;

/**
 * Created by Liam on 01/12/2016.
 */
public class Practice2 {
    private static class Liam {
        void f() {
            System.out.println("Liam.f()");
        }
    }

    public static void main(String[] args) {
        Liam l = null;

        try {
            l.f();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
