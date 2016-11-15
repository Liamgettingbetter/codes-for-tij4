package polymorphism.music3;

import java.util.Random;

/**
 * Created by Liam on 12/11/2016.
 */
public class RandomInstrumentGenerator {
    private Random rand = new Random(47);

    Instrument make() {
        switch (rand.nextInt(5)) {
            case 0 : return new Wind();
            case 1 : return new Percussion();
            case 2 : return new Stringed();
            case 3 : return new WoodWind();
            case 4 : return new Brass();
            default :
                return null;
        }
    }
}
