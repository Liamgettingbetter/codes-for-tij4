package polymorphism.music;

/**
 * Created by Liam on 11/11/2016.
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.B_FLAT);    // 此处发生了运行时绑定
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
