package interfaces.interfaceprocessor;

import static java.lang.System.out;

/**
 * Created by Liam on 14/11/2016.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        out.println("Using Processor " + p.name());
        out.println(p.process(s));
    }
}
