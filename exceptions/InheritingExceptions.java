package exceptions;

/**
 * Created by Liam on 01/12/2016.
 */
class SimpleException extends Exception {}

public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions se = new InheritingExceptions();
        try {
            se.f();
        } catch(SimpleException e) {
            System.out.println("Caught it");
        }
    }
}
