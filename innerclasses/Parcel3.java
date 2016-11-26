package innerclasses;

/**
 * Created by Liam on 18/11/2016.
 */
public class Parcel3 {
    class Content {
        private int i = 1;
        public int value() { return i; }
    }

    class Destination {
        private String label;

        Destination(String s) { this.label = s; }

        String readLabel() { return label; }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        // Must use instance of outer class
        // to create an instance of the inner class;
        Parcel3.Content c = p.new Content();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
