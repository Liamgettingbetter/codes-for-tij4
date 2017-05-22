package math_problems;

/**
 * Created by Liam on 22/05/2017.
 */
public class Test3 {
    public static void main(String[] args) {
        // An example of overflow :
        double d = 1e308;
        System.out.println("Overflow produces infinity : ");
        System.out.println(d + " * 10 = " + d * 10);
        System.out.println();

        // An example of gradual overflow :
        d = 1e-305 * Math.PI;
        System.out.println("Gradual overflow : " + d );
        for(int i = 0; i < 4; i++) {
            System.out.println(" " + (d /= 100000));
        }
        System.out.println();
        System.out.println();

        // An example of NaN :
        System.out.println("0.0 / 0.0 is Not a Number");
        d = 0.0 / 0.0;
        System.out.println(d);
        System.out.println();

        // An example of inexact results and rounding :
        System.out.println("Inexact results with float : ");
        for(int i = 0; i < 100; i++) {
            float z = 1.0f / i;
            if(z * i != 1.0f)
                System.out.print(" " + i);
        }
        System.out.println();
        System.out.println();

        // Another example of inexact results and rounding :
        System.out.println("Inexact results with double : ");
        for(int i = 0; i < 100; i++) {
            double z = 1.0 / i;
            if(z * i != 1.0)
                System.out.print(" " + i);
        }
        System.out.println();
        System.out.println();

        // An example of cast to integer rounding :
        System.out.println("cast to int rounds toward 0 : ");
        d = 12345.6;
        System.out.println((int)d + " " + (int)-d);
    }
}
