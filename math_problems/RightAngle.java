package math_problems;

/**
 * Created by Liam on 29/03/2017.
 */
public class RightAngle {
    /**
     *  To output a right angle with n layers
     *  @param layer the layer of this right angle.
     *  @Author liam
     */
    static void rightAngle(int layer) {
        int total_number = 0;
        int times = 0;
        int current_layer = 1;


        // make sure the total number n-layer will need.
        for(int i = 1; i <= layer; i++) {
            total_number += i;
        }

        // make sure the max length among these numbers,
        // in order to adjust the look of output triangle.
        int length = String.valueOf(total_number).length();
        String l = Integer.toString(length);

        for(int i = 0; i < total_number; i++) {
            System.out.printf("%0" + l + "d ", (i + 1));
            times++;

            if(times == current_layer) {
                System.out.println();
                times = 0;
                current_layer++;
            }
        }
    }

    public static void main(String[] args) {
        rightAngle(100);
    }
}
