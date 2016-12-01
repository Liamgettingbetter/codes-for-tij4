package practice.exceptions;

/**
 * Created by Liam on 01/12/2016.
 */
public class Practice5 {
    public static void main(String[] args) {
        int i = 0;
        do {
            try {
                i++;
                throw new Exception(Integer.toString(i));
            } catch(Exception e) {
                e.printStackTrace();
            }
        } while(i < 5);
    }
}
