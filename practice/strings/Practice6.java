package practice.strings;

/**
 * Created by Liam on 12/12/2016.
 */
public class Practice6 {
    private static class Formatter {
        private int i;
        private long l;
        private float f;
        private double d;

        Formatter(int i, long l, float f, double d) {
            this.i = i;
            this.l = l;
            this.f = f;
            this.d = d;
        }

        @Override
        public String toString() {
            return String.format("int : %d, long : %d, float : %f, double : %e",
                    i, l, f, d);
        }
    }

    public static void main(String[] args) {
        Formatter f = new Formatter(1024, 1024, 1024.00f, 1024.00);
        System.out.println(f.toString());
    }

}
