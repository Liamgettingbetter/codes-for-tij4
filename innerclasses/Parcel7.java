package innerclasses;

/**
 * Created by Liam on 18/11/2016.
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            // Insert a class definition
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p7 = new Parcel7();
        Contents c = p7.contents();
    }
}
