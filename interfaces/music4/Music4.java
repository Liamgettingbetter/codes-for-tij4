package interfaces.music4;

import polymorphism.music.Note;
import static java.lang.System.out;

/**
 * Created by Liam on 14/11/2016.
 */
abstract class Instrument {
    private int i;

    public abstract void play(Note n);
    public String what() { return "Instrument"; }
    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        out.println("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {}
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        out.println("Percussion.play() " + n);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {}
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        out.println("Stringed.play() " + n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {}
}

class Brass extends Wind {
    @Override
    public void play(Note n) {
        out.println("Brass.play() " + n);
    }

    @Override
    public void adjust() {
        out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        out.println("Woodwind.play() " + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] is) {
        for(Instrument i : is)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
        };
        tuneAll(orchestra);
    }
}
