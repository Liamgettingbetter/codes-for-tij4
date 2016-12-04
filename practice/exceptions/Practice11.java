package practice.exceptions;

/**
 * Created by Liam on 04/12/2016.
 */
public class Practice11 {
    private static class Exception1 extends Exception {}
    private static class Exception2 extends Exception {}

    private static void g() throws Exception1 {
        throw new Exception1();
    }

    private static void f() {
        try {
            g();
        }
        catch(Exception1 e1) {
            throw new RuntimeException(e1);
        }
    }

    public static void main(String[] args) {
        try {
            f();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
