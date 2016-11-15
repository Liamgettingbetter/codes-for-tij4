package interfaces.classprocessor;

import java.util.*;
import static java.lang.System.out;

/**
 * Created by Liam on 14/11/2016.
 */
class Processor {
    String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    @Override
    String process(Object input) {
        // Covariant return
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor {
    @Override
    String process(Object input) {
        return((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        // The split() argument divides a String into pieces.
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        out.println("Using Processor " + p.name());
        out.println(p.process(s));
    }
    public static String s =
            "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}
