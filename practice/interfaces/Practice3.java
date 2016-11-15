package practice.interfaces;

import static java.lang.System.out;

/**
 * Created by Liam on 14/11/2016.
 */
abstract class Print {
    abstract void print();

    Print() {
        print();
    }
}

class Liam extends Print {
    private int i = 12;

    @Override
    void print() {
        out.println("i = " + i);
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Liam l = new Liam();
        l.print();
    }
}
