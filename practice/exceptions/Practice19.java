package practice.exceptions;

/**
 * Created by Liam on 06/12/2016.
 */
public class Practice19 {
    private static class VeryImportantException extends Exception {
        @Override
        public String toString() {
            return "A very important exception";
        }
    }

    private static class TrivialException extends Exception {
        @Override
        public String toString() {
            return "A trivial exception";
        }
    }

    private void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    private void d() throws TrivialException {
        throw new TrivialException();
    }

    public static void main(String[] args) {
        try {
            Practice19 p = new Practice19();
            try {
                p.f();
            }
            finally {
                try {
                    p.d();
                }
                catch(TrivialException e) {
                    System.out.println(e);
                }
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
