package innerclasses;

import com.sun.jarsigner.ContentSigner;

/**
 * Created by Liam on 19/11/2016.
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() { return i; }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String s) { this.label = s; }

        @Override
        public String readLabel() {
            return label;
        }

        // Nested classes can contain other static elements.
        public static void f() {}
        static int x = 10;
        static class AnotherLevel {
            public static void f() {}
            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}
