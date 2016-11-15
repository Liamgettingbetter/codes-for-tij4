package practice.polymorphism;

import java.nio.file.attribute.UserDefinedFileAttributeView;

import static java.lang.System.out;

/**
 * Created by Liam on 11/11/2016.
 */
class Cycles {
    void wheels() {}
}

class Unicycles extends Cycles {
    @Override
    void wheels() {
        out.println("Unicycle has one wheel.");
    }
}

class Bycycles extends Cycles {
    @Override
    void wheels() {
        out.println("Bicycle has two wheels.");
    }
}

class Tricycles extends Cycles {
    @Override
    void wheels() {
        out.println("Tricycle has three wheels.");
    }
}

public class Practice5 {
    public static void ride(Cycles c) {
        c.wheels();
    }

    public static void main(String[] args) {
        Unicycles us = new Unicycles();
        Bycycles bs = new Bycycles();
        Tricycles ts = new Tricycles();

        ride(us);
        ride(bs);
        ride(ts);
    }
}
