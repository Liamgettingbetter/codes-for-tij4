package practice.arrays;

import arrays.ContainerComparison.BerylliumSphere;

/**
 * Created by Liam on 03/04/2017.
 */
public class Practice1 {
    private static void myArray(BerylliumSphere[] arrays) {
        System.out.println(arrays);
    }

    public static void main(String[] args) {
        myArray(new BerylliumSphere[] {
            new BerylliumSphere(),
            new BerylliumSphere()
        });

        BerylliumSphere[] f = {
            new BerylliumSphere(),
            new BerylliumSphere()
        };
        myArray(f);
    }
}
