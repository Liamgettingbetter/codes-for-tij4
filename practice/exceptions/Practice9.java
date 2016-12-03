package practice.exceptions;

/**
 * Created by Liam on 03/12/2016.
 */
public class Practice9 {
    private static class Exception1 extends Exception {
        Exception1() {
            System.out.println("Exception1");
        }
    }

    private static class Exception2 extends Exception {
        Exception2() {
            System.out.println("Exception2");
        }
    }

    private static class Exception3 extends Exception {
        Exception3() {
            System.out.println("Exception3");
        }
    }

    private static class MyException extends Exception {
        private Exception1 e1;
        private Exception2 e2;
        private Exception3 e3;

        MyException(Exception1 e1, Exception2 e2, Exception3 e3) {
            this.e1 = e1;
            this.e2 = e2;
            this.e3 = e3;
        }

        private Exception1 getE1() {
            return  e1;
        }

        private Exception2 getE2() {
            return e2;
        }

        private Exception3 getE3() {
            return e3;
        }
    }

    private static void throw_() throws MyException {
        throw new MyException(new Exception1(), new Exception2(), new Exception3());
    }

    public static void main(String[] args) {
        try {
            throw_();
        } catch(MyException e) {
            e.getE1().printStackTrace();
            e.getE2().printStackTrace();
            e.getE3().printStackTrace();
        }
    }
}
