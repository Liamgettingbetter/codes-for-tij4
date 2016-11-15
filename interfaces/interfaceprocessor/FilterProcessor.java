package interfaces.interfaceprocessor;

import interfaces.filters.*;

/**
 * Created by Liam on 14/11/2016.
 */
class FilterAdapter implements Processor {
    Filter f;

    public FilterAdapter(Filter f) {
        this.f = f;
    }

    @Override
    public String name() {
        return f.name();
    }

    @Override
    public Waveform process(Object input) {
        return f.process((Waveform)input);
    }
}

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
