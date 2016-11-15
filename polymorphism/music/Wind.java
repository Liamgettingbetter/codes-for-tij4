package polymorphism.music;

import static java.lang.System.out;

/**
 * Created by Liam on 11/11/2016.
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        out.println("Wind.play() " + n);
    }
}
