package practice.strings;

import java.util.Arrays;
import strings.Splitting;


/**
 * Created by Liam on 13/12/2016.
 */
public class Practice8 {
    public static void main(String[] args) {
        String alias = Splitting.knights;
        System.out.println(Arrays.toString(alias.split("the|you")));

    }
}