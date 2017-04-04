package practice.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Liam on 04/04/2017.
 */
public class Practice3 {
    private static Double[][] create(int x, int y, double lower, double upper) {
        Random rand = new Random(11);
        Double[][] result = new Double[x][y];

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = Math.floor(Math.nextAfter(lower, upper));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(create(5, 10, 0.1, 9.9)));
    }
}
