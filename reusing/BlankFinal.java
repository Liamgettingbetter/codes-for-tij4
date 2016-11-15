package reusing;

import com.sun.deploy.util.BlackList;

/**
 * Created by Liam on 11/10/16.
 */
class Poppet {
    private int i;

    Poppet(int i) {
        this.i = i;
    }
}

public class BlankFinal {
    private final int i = 0;  // Initialized final
    private final int j;      // Blank final
    private final Poppet p;   // Blank final reference

    // Blank finals must be initialized in the constructor
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
