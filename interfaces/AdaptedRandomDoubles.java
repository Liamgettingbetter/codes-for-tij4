package interfaces;

import java.util.Scanner;
import java.nio.CharBuffer;

/**
 * Created by Liam on 15/11/2016.
 */
public class AdaptedRandomDoubles extends RandomDoubles
    implements Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }   

    @Override
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));

        while(s.hasNext())
            System.out.println(s.nextDouble() + " ");
    }
}
