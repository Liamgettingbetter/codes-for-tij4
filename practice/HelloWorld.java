package practice;

import practice.access.Practice4;

import static java.lang.System.out;

/**
 * Created by Liam on 11/4/16.
 */
class Print {
    static void println(String s) {
        out.println("String : " + s);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Print.println("Hello world ! ");

        Practice4 a = new Practice4(2);
    }
}
