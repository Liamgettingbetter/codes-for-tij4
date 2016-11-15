package interfaces.music5;

import polymorphism.music.Note;
import static java.lang.System.out;

/**
 * Created by Liam on 14/11/2016.
 */
interface Instrument {
    // Compile time constant
    int VALUE = 5;  // static & final
    // Cannot have method definitions :
    void play(Note n);  // Automatically public
    void adjust();
}

class Wind implements Instrument {
    @Override
    public void play(Note n) {
        out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument {
    @Override
    public void play(Note n) {
        out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument {
    @Override
    public void play(Note n) {
        out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        out.println(this + ".adjust()");
    }
}

class  Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrument i) {
        i.play(Note.C_SHARP);
    }

    static void tuneAll(Instrument[] is) {
        for(Instrument i : is)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] is = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
        };

        tuneAll(is);
    }
}
