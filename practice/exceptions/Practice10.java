package practice.exceptions;

/**
 * Created by Liam on 04/12/2016.
 */
public class Practice10 {
    private static class Exception1 extends Exception {}
    private static class Exception2 extends Exception {}

    static void f() throws Exception2 {
        try {
            g();
        }
        catch(Exception1 e) {
            Exception2 e2 = new Exception2();
            e2.initCause(e);
            throw e2;
        }
    }

    static void g() throws Exception1 {
        throw new Exception1();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception2 e) {
            e.printStackTrace();
        }
    }
}
