package polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 13/11/2016.
 */
class Glyph {
    void draw() {
        out.println("Glyph.draw()");
    }

    Glyph() {
        out.println("Glyph() before draw()");
        draw();
        out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
