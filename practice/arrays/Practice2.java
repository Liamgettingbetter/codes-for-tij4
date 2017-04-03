package practice.arrays;

import arrays.ContainerComparison.BerylliumSphere;

/**
 * Created by Liam on 03/04/2017.
 */
public class Practice2 {
    private static Object[] myArrays(int size) {
        Object[] result = new BerylliumSphere[size];

        for(int i = 0; i < size; i++)
            result[i] = new BerylliumSphere();
        return result;
    }

    public static void main(String[] args) {
        Object[] o = myArrays(10);
        System.out.println(o);
    }
}
