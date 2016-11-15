package reusing;

import static java.lang.System.out;

/**
 * Created by Liam on 11/9/16.
 */
class Cleanser {
    private String s = "Cleanser ";

    public void append(String s) { this.s += s; }
    public void dilute() { append("dilute() "); }
    public void apply() { append("apply() "); }
    public void scrub() { append("scrub() "); }

    @Override public String toString() { return s; }

    public static void main(String[] args) {
        Cleanser c = new Cleanser();
        c.dilute();
        c.apply();
        c.scrub();
        out.println(c);
    }
}

public class Detergent extends Cleanser {
    // Change a method

    @Override
    public void scrub() {
        append("Detergent.scrub() ");
        super.scrub();
    }

    // Add methods to the interface
    public void foam() {
        append("foam() ");
    }

    // Test the new class
    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        out.println(d);
        out.println("Test the new class");
        // 调用基类的main
       Cleanser.main(args);
    }
}
