package polymorphism.music;

import static java.lang.System.out;

/**
 * Created by Liam on 11/11/2016.
 */
class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        out.println("Stringed.play() " + n);
    }
}

class Brass extends Instrument {
    @Override
    public void play(Note n) {
        out.println("Brass.play() " + n);
    }
}

public class Music2 {
    public static void tune(Wind w) {
        w.play(Note.C_SHARP);
    }

    public static void tune(Stringed s) {
        s.play(Note.C_SHARP);
    }

    public static void tune(Brass b) {
        b.play(Note.C_SHARP);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed s = new Stringed();
        Brass b = new Brass();
        tune(flute);
        tune(s);
        tune(b);
    }
}
