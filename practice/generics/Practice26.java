package practice.generics;

/**
 * Created by Liam on 11/03/2017.
 */
public class Practice26 {
    public static void main(String[] args) {
        // Covariant Array
        Number[] nums = new Integer[10];
        nums[0]       = new Integer(1);
        nums[2]       = new Integer(2);
    }
}
