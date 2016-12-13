package strings;

/**
 * Created by Liam on 13/12/2016.
 */
public class Rudolph {
    public static void main(String[] args) {
        for(String pattern : new String[]{"Rudolph",
            "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"})
            System.out.println("Rudolph".matches(pattern));
    }
}
