package exceptions;

/**
 * Created by Liam on 06/12/2016.
 */
public class LostMessage {
    private static class VeryImportantException extends Exception {
        @Override
        public String toString() {
            return "A very important Exception";
        }
    }

    private static class HoHumException extends Exception {
        @Override
        public String toString() {
            return "A trivial exception";
        }
    }

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f(); // very important exception is lost !
            }
            finally {
                lm.dispose();
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
}
