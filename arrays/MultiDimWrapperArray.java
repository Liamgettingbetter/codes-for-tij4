package arrays;

import java.util.Arrays;

/**
 * Created by Liam on 04/04/2017.
 */
public class MultiDimWrapperArray {
    public static void main(String[] args) {
        Integer[][] a = {
            { 1, 2, 3 },
            { 4, 5, 6 },
        };

        Double[][][] b = {
            {{ 1.1, 2.2 }, { 3.3, 4.4 }},
            {{ 5.5, 6.6 }, { 7.7, 8.8 }},
            {{ 9.9, 1.2 }, { 2.3, 3.4 }}
        };

        String[][] c = {
            { "The", "Quick", "Sly", "Fox" },
            { "Jumped", "Over" },
            { "The", "Lazy", "Brown", "Dog", "and", "friend" },
        };

        System.out.println("a : " + Arrays.deepToString(a));
        System.out.println("b : " + Arrays.deepToString(b));
        System.out.println("c : " + Arrays.deepToString(c));
    }
}