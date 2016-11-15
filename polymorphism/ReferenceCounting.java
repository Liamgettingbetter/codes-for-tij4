package polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 12/11/2016.
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if(--refcount == 0)
            out.println("Disposing " + this);
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared s) {
        out.println("Creating " + this);
        this.shared = s;
        this.shared.addRef();
    }

    protected void dispose() {
        out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared s = new Shared();
        Composing[] com = {
            new Composing(s), new Composing(s),
            new Composing(s), new Composing(s),
            new Composing(s), new Composing(s),
        };

        for(Composing c : com)
            c.dispose();
    }
}
