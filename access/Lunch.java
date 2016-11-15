package access;

/**
 * Created by Liam on 11/8/16.
 */
class Soup1 {
    private Soup1() {}

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}

    public static Soup2 s2 = new Soup2();

    public static Soup2 access() {
        return s2;
    }

    public void f() {}
}

public class Lunch {
    void testPrivate() {
        //! Soup1 s1 = new Soup1();
    }

    void testStatic() {
        Soup1 s1 = Soup1.makeSoup();
    }

    void testAccess() {
        Soup2.access().f();
    }

}
