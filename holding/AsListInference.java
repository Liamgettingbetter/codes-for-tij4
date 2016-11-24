package holding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/**
 * Created by Liam on 24/11/2016.
 */
class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snowl = Arrays.asList(
            new Crusty(), new Slush(), new Powder());

        // Won't compile
        List<Snow> snow2 = Arrays.asList(
            new Light(), new Heavy());
        List<Snow> s3 = new ArrayList<>();
        Collections.addAll(s3, new Light(), new Heavy());

        // Give a hint using an explicit type argument specification
        List<Snow> s4 = Arrays.<Snow>asList(
            new Light(), new Heavy());
    }
}
