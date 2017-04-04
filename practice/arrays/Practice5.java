package practice.arrays;

import arrays.ContainerComparison.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by Liam on 04/04/2017.
 */
public class Practice5 {
    private static BerylliumSphere[][] create(int x, int y) {
        BerylliumSphere[][] result = new BerylliumSphere[x][y];

        for(int i = 0; i < x; i++)
            for(int j = 0; j < y; j++) {
                result[i][j] = new BerylliumSphere();
            }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(create(2, 4)));
    }
}
