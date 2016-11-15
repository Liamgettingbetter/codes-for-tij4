package reusing;

/**
 * Created by Liam on 11/10/16.
 */
class Instrument {
    void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind w = new Wind();
        Instrument.tune(w);
    }
}
