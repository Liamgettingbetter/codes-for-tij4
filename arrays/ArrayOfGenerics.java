package arrays;

import java.util.List;
import java.util.ArrayList;
import arrays.ContainerComparison.BerylliumSphere;

/**
 * Created by Liam on 04/04/2017.
 */
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[])la;    // "Unchecked" warning
        ls[0] = new ArrayList<>();

        // The problem: List<String> is a subtype of Object
        Object[] objects = ls;  // So assignment is OK
        // Compiles and runs without complaint:
        objects[1] = new ArrayList<>();

        // However, if your needs are straightforward it is
        // possible to create an array of generics, albeit
        // with an "unchecked" warning:
        List<BerylliumSphere>[] spheres =
                (List<BerylliumSphere>[])new List[10];

    }
}