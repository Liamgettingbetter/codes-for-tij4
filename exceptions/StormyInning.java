package exceptions;

/**
 * Created by Liam on 06/12/2016.
 */
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}

    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {}   // Throws no checked exceptions
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    // Okay to add new exceptions for constructors, but
    // you must deal with the base constructor exceptions
    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}

    // Regular methods must conform to base class
    //! void walk() throws PopFoul {}

    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    //! public void event() throws RainedOut {}

    // If the method doesn't already exist in the
    // base class, the exception is OK:
    @Override
    public void rainHard() throws RainedOut {}

    // You can choose not to throw any exception,
    // even if the base class does:
    @Override
    public void event() {}

    // Overriden methods can throw inherited exceptions :
    @Override
    public void atBat() throws PopFoul {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        }
        catch(PopFoul e) {
            System.out.println("Pop Foul");
        }
        catch(RainedOut e) {
            System.out.println("Rained out");
        }
        catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        // Strike not thrown in derived version.
        try {
            // What happened if you upcast ?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method
        }
        catch(Strike e) {
            System.out.println("Strike");
        }
        catch(Foul e) {
            System.out.println("Foul");
        }
        catch(RainedOut e) {
            System.out.println("Rained out");
        }
        catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}