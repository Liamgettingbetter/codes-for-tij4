package polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 13/11/2016.
 */
class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat();
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        out.println(g);
        m = new WheatMill();
        //? Wheat w = m.process();
        g = m.process();
        out.println(g);
    }
}
