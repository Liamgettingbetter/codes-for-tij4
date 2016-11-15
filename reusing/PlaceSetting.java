package reusing;

import static java.lang.System.out;

/**
 * Created by Liam on 11/9/16.
 */
class Plate {
    Plate(int i) {
        out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        out.println("DinnerPlate constructor");
    }
}

class Utensil {
    Utensil(int i) {
        out.println("Utensil constructor");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        out.println("Spoon constructor");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        out.println("Fork constructor");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        out.println("Knife constructor");
    }
}

class Custom {
    Custom(int i) {
        out.println("Custom constructor");
    }
}

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork fk;
    private Knife kf;
    private DinnerPlate dp;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        fk = new Fork(i + 3);
        kf = new Knife(i + 4);
        dp = new DinnerPlate(i + 5);
        out.println("PlateSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting p = new PlaceSetting(9);
    }
}
