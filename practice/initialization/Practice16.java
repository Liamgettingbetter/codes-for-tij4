package practice.initialization;

/**
 * Created by Liam on 11/4/16.
 */
public class Practice16 {
    public static void main(String[] args) {
        String[] strings = {
            "Remember,", "nothing", "is", "true,",
            "everything", "is", "permitted.",
            "We", "live", "in", "the", "dark",
            "to", "serve", "the", "light,",
            "we", "are", "assassins",
        };

        for(String s : strings) {
            System.out.print(s + " ");
        }
    }
}
