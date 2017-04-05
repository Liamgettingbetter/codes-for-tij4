package practice.arrays;

import arrays.ContainerComparison.*;

/**
 * Created by Liam on 05/04/2017.
 */
public class Practice18 {
    public static void main(String[] args) {
        BerylliumSphere[] array = new BerylliumSphere[5];
        BerylliumSphere[] dest = new BerylliumSphere[5];

        for(int i = 0; i < array.length; i++)
            array[i] = new BerylliumSphere();

        System.arraycopy(array, 0, dest, 0, array.length);
    }
}
