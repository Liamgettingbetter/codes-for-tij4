package practice.exceptions;

import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Liam on 02/12/2016.
 */
public class Practice6 {
    private static class MyException1 extends Exception {
        MyException1() {
            Logger logger = Logger.getLogger("MyException1");
            StringWriter trace = new StringWriter();
            logger.severe(trace.toString());
        }
    }

    private static class MyException2 extends Exception {
        MyException2() {
            Logger logger = Logger.getLogger("MyException2");
            StringWriter trace = new StringWriter();
            logger.severe(trace.toString());
        }
    }

    public static void main(String[] args) {
        try {
            throw new MyException1();
        } catch(MyException1 e) {
            e.printStackTrace();
        }

        try {
            throw new MyException2();
        } catch(MyException2 e) {
            e.printStackTrace();
        }
    }
}
