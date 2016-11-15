package interfaces.filters;

/**
 * Created by Liam on 14/11/2016.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
