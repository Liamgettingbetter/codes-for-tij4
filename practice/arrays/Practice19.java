package practice.arrays;

import java.util.Arrays;

/**
 * Created by Liam on 05/04/2017.
 */
class Fuck {
    private int instance;

    Fuck(int i) {
        this.instance = i;
    }
}

public class Practice19 {
    public static void main(String[] args) {
        Fuck[] f1 = new Fuck[5];
        Fuck[] f2 = new Fuck[5];

        Arrays.fill(f1, new Fuck(2));
        System.out.println(Arrays.equals(f1, f2));
    }
}
