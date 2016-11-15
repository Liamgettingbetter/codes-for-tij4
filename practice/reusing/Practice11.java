package practice.reusing;

/**
 * Created by Liam on 11/9/16.
 */
class Cleanser {
    private String name = "Cleanser";

    void append(String s) { name += s; }
    void dilute() { append(" dilute()"); }
    void apply() { append(" apply()"); }
    void scrub() { append(" scrub()"); }

    @Override public String toString() { return name; }

    public static void main(String[] args) {
        Cleanser c = new Cleanser();
        c.dilute();
        c.scrub();
        c.apply();
        System.out.println(c);
    }
}

class Detergent {
    private Cleanser c = new Cleanser();

    void dilute() {
        c.dilute();
    }

    void apply() {
        c.apply();
    }

    void scrub() {
        c.scrub();
    }

    void foam() {
        c.append(" foam()");
    }

    @Override public String toString() {
        return c.toString();
    }
}

public class Practice11 {
    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        System.out.println(d);
    }
}
