package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Liam on 02/12/2016.
 */
class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("Logging Exception");

    public LoggingException() {
        StringWriter sw = new StringWriter();
        printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }

        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}

