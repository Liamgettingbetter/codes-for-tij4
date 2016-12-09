package practice.exceptions;

/**
 * Created by Liam on 09/12/2016.
 */
public class Practice28 {
    private static class MyException extends RuntimeException {
        String label;

        MyException(String s) {
            this.label = s;
        }

        private void show() {
            System.out.println(label);

        }
    }

    public static void main(String[] args) {
        MyException m = new MyException("MyExcepiton");
        m.show();
    }
}
