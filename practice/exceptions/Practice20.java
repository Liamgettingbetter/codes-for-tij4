package practice.exceptions;

/**
 * Created by Liam on 07/12/2016.
 */
public class Practice20 {
    private static class BaseballException extends Exception {}
    private static class Foul extends BaseballException {}
    private static class Strike extends BaseballException {}

    private static abstract class Inning {
        Inning() throws BaseballException {}

        void event() throws BaseballException {}

        abstract void atBat() throws Strike, Foul;

        void walk() {}
    }

    private static class UmpireException extends Exception {}
    private static class StormException extends Exception {}
    private static class RainedOut extends StormException {}
    private static class PopFoul extends Foul {}

    private interface Storm {
        void event() throws RainedOut;
        void rainHard() throws RainedOut;
    }

    private static class StormyInning extends Inning implements Storm {
        StormyInning() throws RainedOut, BaseballException {}
        StormyInning(String s) throws Foul, BaseballException {}

        @Override
        public void rainHard() throws RainedOut {}

        @Override
        public void event() {}

        @Override
        void atBat() throws PopFoul {}

        void umpexThrow() throws UmpireException {}
    }

    public static void main(String[] args) {}
}