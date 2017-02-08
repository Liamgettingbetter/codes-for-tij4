package generics;

/**
 * Created by Liam on 08/02/2017.
 */
class Automobile {}

public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}
