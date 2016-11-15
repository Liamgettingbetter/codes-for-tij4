package practice.reusing;

/**
 * Created by Liam on 11/10/16.
 */
class Type {
    private final int i1;
    private static final int i2 = 100;

    {
        System.out.println(i2);
    }

    public Type(int i) {
        this.i1 = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i1);
    }
}

public class Practice18 {
    public static void main(String[] args) {
        Type t = new Type(21);
        System.out.println(t);
    }
}
