package practice.interfaces;

import static java.lang.System.out;
/**
 * Created by Liam on 14/11/2016.
 */
abstract class Rodent {
    abstract void bite();
}

class Mouse extends Rodent {
    @Override
    void bite() {
        out.println("Mouse.bite()");
    }
}

class Gerbil extends Rodent {
    @Override
    void bite() {
        out.println("Gerbil.bite()");
    }
}

class Hamster extends Rodent {
    @Override
    void bite() {
        out.println("Hamster.bite()");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Rodent[] rs = {
            new Mouse(),
            new Gerbil(),
            new Hamster(),
        };

        for(Rodent r : rs)
            r.bite();
    }
}
