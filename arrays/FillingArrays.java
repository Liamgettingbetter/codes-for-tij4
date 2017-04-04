package arrays;

import java.util.Arrays;

/**
 * Created by Liam on 04/04/2017.
 */
public class FillingArrays {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        boolean[] bools   = new boolean[SIZE];
        byte[]    bytes   = new byte[SIZE];
        char[]    chars   = new char[SIZE];
        short[]   shorts  = new short[SIZE];
        int[]     ints    = new int[SIZE];
        long[]    longs   = new long[SIZE];
        float[]   floats  = new float[SIZE];
        double[]  doubles = new double[SIZE];
        String[]  strings = new String[SIZE];

        Arrays.fill(bools, true);
        System.out.println("bools = " + Arrays.toString(bools));

        Arrays.fill(bytes, (byte)11);
        System.out.println("bytes = " + Arrays.toString(bytes));

        Arrays.fill(chars, 'x');
        System.out.println("chars = " + Arrays.toString(chars));

        Arrays.fill(shorts, (short)17);
        System.out.println("shorts = " + Arrays.toString(shorts));

        Arrays.fill(ints, 19);
        System.out.println("ints = " + Arrays.toString(ints));

        Arrays.fill(longs, 23);
        System.out.println("longs = " + Arrays.toString(longs));

        Arrays.fill(floats, 29);
        System.out.println("floats = " + Arrays.toString(floats));

        Arrays.fill(doubles, 47);
        System.out.println("doubles = " + Arrays.toString(doubles));

        Arrays.fill(strings, "Hello");
        System.out.println("strings = " + Arrays.toString(strings));

        // Manipulating ranges
        Arrays.fill(strings, 3, 5, "World");
        System.out.println("strings = " + Arrays.toString(strings));
    }
}
