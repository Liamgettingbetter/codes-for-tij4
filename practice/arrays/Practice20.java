package practice.arrays;

import java.util.Arrays;

/**
 * Created by Liam on 05/04/2017.
 */
public class Practice20 {
    public static void main(String[] args) {
        int[][] show = new int[3][3];
        int[][] fuck = new int[3][3];
        System.out.println(Arrays.deepEquals(show, fuck));

        show = new int[4][3];
        fuck = new int[2][5];
        System.out.println(Arrays.deepEquals(show, fuck));
    }
}
