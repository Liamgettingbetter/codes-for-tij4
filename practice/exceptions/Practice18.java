package practice.exceptions;

/**
 * Created by Liam on 06/12/2016.
 */
public class Practice18 {
    private static class VeryImportantException extends Exception {
        @Override
        public String toString() {
            return "A very important exception";
        }
    }

    private static class HoHumException extends Exception {
        @Override
        public String toString() {
            return "a trivial exception";
        }
    }

    private void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    private void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            Practice18 p = new Practice18();
            try {
                p.f();
            }
            finally {
                try {
                    p.dispose();
                }
                finally {
                    throw new RuntimeException();
                }
            }
        }
        catch(Exception e) {
            System.out.print(e);
        }
    }
}
