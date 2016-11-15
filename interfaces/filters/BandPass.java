package interfaces.filters;

/**
 * Created by Liam on 14/11/2016.
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCut, double highCut) {
        this.lowCutoff = lowCut;
        this.highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
