package practice.initialization;

/**
 * Created by Liam on 11/4/16.
 */
class StringVargs {
    StringVargs(String... args) {
        for(String s : args)
            System.out.print(s + " ");
    }
}

public class Practice19 {
    public static void main(String[] args) {
        String[] s = new String[] {
            "We", "are", "assassins",
        };

        new StringVargs("We", "live", "in", "the",
                "dark", "to", "serve", "the", "light");
        new StringVargs(s);
    }
}
