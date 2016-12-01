package practice.exceptions;

/**
 * Created by Liam on 01/12/2016.
 */
public class Practice4 {
    private static class MyException extends Exception {
        String label;

        MyException(String s) {
            this.label = s;
        }

        private void show() {
            System.out.println(label);

        }
    }

    public static void main(String[] args) {
        try {
            MyException m = new MyException("Hello World");
            m.show();
            throw new MyException("Liam");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
