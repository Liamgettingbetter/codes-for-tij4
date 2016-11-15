package polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 12/11/2016.
 */
class Meal {
    Meal() {
        out.println("Meal()");
    }
}

class Bread {
    Bread() {
        out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch {
    private static Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
