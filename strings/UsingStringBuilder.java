package strings;

import java.util.Random;

/**
 * Created by Liam on 10/12/2016.
 */
public class UsingStringBuilder {
    public static Random rand = new Random(47);

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder builder = new UsingStringBuilder();
        System.out.println(builder);
    }
}
