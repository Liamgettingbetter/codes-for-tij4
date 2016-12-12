package practice.strings;

import java.util.Formatter;

/**
 * Created by Liam on 12/12/2016.
 */
public class Practice5 {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("%s, %d, %b, %x, %h, %f, %e, %c", "Liam", 1024,
                true, 1024, 1024, 1024.00, 1024.00, 'a');
    }
}
