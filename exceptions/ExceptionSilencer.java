package exceptions;

/**
 * Created by Liam on 06/12/2016.
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }
        finally {
            // Using 'return' inside the finally block
            // will silence any thrown exception
            return;
        }
    }
}
