package practice.polymorphism;

/**
 * Created by Liam on 12/11/2016.
 */
class Rodent {
    void bite() {
        System.out.println("Rodent.bite()");
    }
}

class Mouse extends Rodent {
    @Override
    void bite() {
        System.out.println("Mouse.bite()");
    }
}

class Gerbil extends Rodent {
    @Override
    void bite() {
        System.out.println("Gerbil.bite()");
    }
}

class Hamster extends Rodent {
    @Override
    void bite() {
        System.out.println("Hamster.bite()");
    }
}

public class Practice9 {
    public static void main(String[] args) {
        Rodent[] r = {
            new Rodent(),
            new Hamster(),
            new Mouse(),
            new Gerbil(),
            new Rodent(),
            new Gerbil(),
        };

        for(Rodent rs : r) {
            rs.bite();
        }
    }
}
