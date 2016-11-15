package polymorphism.music3;

import static java.lang.System.out;
import polymorphism.music.Note;

/**
 * Created by Liam on 11/11/2016.
 */
class Instrument {
    void play(Note n) {
        out.println("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        out.println("Adjust Instrument");
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        out.println("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        out.println("Adjust Wind");
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        out.println("Adjust Percussion");
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        out.println("Adjust Stringed");
    }
}

class WoodWind extends Wind {
    @Override
    void play(Note n) {
        out.println("WoodWind.play() " + n);
    }

    @Override
    String what() {
        return "WoodWind";
    }
}

class Brass extends Wind {
    @Override
    void play(Note n) {
        out.println("Brass.play() " + n);
    }

    @Override
    String what() {
        return "Brass";
    }
}

public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.C_SHARP);
    }

    public static void tuneAll(Instrument[] is) {
        for(Instrument i : is)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new WoodWind()
        };

        tuneAll(orchestra);
    }
}
