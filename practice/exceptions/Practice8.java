package practice.exceptions;

/**
 * Created by Liam on 03/12/2016.
 */
public class Practice8 {
    private static class MyException {
        void f() throws NullPointerException {
            throw new NullPointerException();
        }
    }

    public static void main(String[] args) {
        try {
            new MyException().f();
        } catch(NullPointerException e) {
            e.printStackTrace(System.err);
            System.out.println("Caught it");
        }
    }
}
