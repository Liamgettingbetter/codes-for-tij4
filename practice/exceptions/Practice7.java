package practice.exceptions;

import java.util.logging.Logger;

/**
 * Created by Liam on 02/12/2016.
 */
public class Practice7 {
    public static void main(String[] args) {
        int[] l = new int[10];
        for(int i = 0; i < 10; i++)
            l[i] = i;

        try {
            System.out.println(Integer.toString(l[11]));
        } catch(Exception e) {
            Logger logger = Logger.getAnonymousLogger();
            logger.severe(e.toString());
        }
    }
}
