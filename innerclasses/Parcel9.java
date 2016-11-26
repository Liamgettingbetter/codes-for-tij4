package innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
public class Parcel9 {
    // Arguments must be final to use inside
    // anonymous inner class:
    public Destination destination(String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}

