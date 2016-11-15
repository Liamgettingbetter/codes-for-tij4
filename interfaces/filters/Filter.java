package interfaces.filters;

/**
 * Created by Liam on 14/11/2016.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
