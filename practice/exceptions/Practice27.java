package practice.exceptions;

/**
 * Created by Liam on 09/12/2016.
 */
public class Practice27 {
    public static void main(String[] args) {
        int[] l = new int[10];

        for(int i = 0; i < 10; i++)
            l[i] = i;

        try {
            System.out.println(Integer.toString(l[11]));
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
