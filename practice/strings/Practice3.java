package practice.strings;

import java.util.Formatter;
import java.io.PrintStream;

/**
 * Created by Liam on 11/12/2016.
 */
public class Practice3 {
    private static class Turtle {
        private String name;
        private Formatter f;

        Turtle(String name, Formatter f) {
            this.name = name;
            this.f    = f;
        }

        void move(int x, int y) {
            f.format("%s This turtle is at (%d %d)\n", name, x, y);
        }
    }

    public static void main(String[] args) {
        PrintStream alias = System.err;
        Turtle tom = new Turtle("Tom",
                new Formatter(System.out));
        Turtle jerry = new Turtle("Jerry",
                new Formatter(alias));

        tom.move(0,0);
        jerry.move(4,8);
        tom.move(3,4);
        jerry.move(2,5);
        tom.move(3,3);
        jerry.move(3,3);
    }
}
