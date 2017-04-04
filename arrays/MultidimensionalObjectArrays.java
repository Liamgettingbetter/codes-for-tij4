package arrays;

import java.util.Arrays;
import arrays.ContainerComparison.BerylliumSphere;

/**
 * Created by Liam on 04/04/2017.
 */
public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {
            { new BerylliumSphere(), new BerylliumSphere() },
            { new BerylliumSphere(), new BerylliumSphere(),
              new BerylliumSphere(), new BerylliumSphere(), },
            { new BerylliumSphere(), new BerylliumSphere(),
              new BerylliumSphere(), new BerylliumSphere(),
              new BerylliumSphere(), new BerylliumSphere(),
              new BerylliumSphere(), new BerylliumSphere()},
        };
        System.out.println(Arrays.deepToString(spheres));
    }
}
