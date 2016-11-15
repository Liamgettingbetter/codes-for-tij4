package practice.polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 11/11/2016.
 */
class Cycle {
    void run() {
        out.println("Cycle.run()");
    }
}

class Unicycle extends Cycle {
    @Override
    void run() {
        out.println("Unicycle.run()");
    }
}

class Bycycle extends Cycle {
    @Override
    void run() {
        out.println("Bicycle.run()");
    }
}

class Tricycle extends Cycle {
    @Override
    void run() {
        out.println("Tricycle.run()");
    }
}

public class Practice1 {
    public static void ride(Cycle c) {
        c.run();
    }

    public static void main(String[] args) {
        Cycle c = new Cycle();
        Unicycle uc = new Unicycle();
        Bycycle bc = new Bycycle();
        Tricycle tc = new Tricycle();

        ride(c);
        ride(uc);
        ride(bc);
        ride(tc);
    }
}
