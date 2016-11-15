package interfaces.interfaceprocessor;

/**
 * Created by Liam on 14/11/2016.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
