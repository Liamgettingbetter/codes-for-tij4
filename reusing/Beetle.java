package reusing;

import static java.lang.System.out;

/**
 * Created by Liam on 11/10/16.
 */
class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        out.println("i = " + this.i + ", j = " + j);
        j = 9;
    }

    private static int x1 =
        printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        // super();  --- 每当调用继承类的构造方法时，Java的编译器默认首先调用基类的构造方法。
        out.println("k = " + k);
        out.println("j = " + j);
    }

    private static int x2 =
        printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
