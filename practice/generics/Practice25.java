package practice.generics;

/**
 * Created by Liam on 05/03/2017.
 */
interface A1 {}
interface B1 {}
class AB implements A1, B1 {
    @Override
    public String toString() {
        return "AB";
    }
}

public class Practice25 {
    static <T extends A1> void a1(T t) {
        System.out.println(t);
    }

    static <T extends B1> void b1(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        AB ab = new AB();
        a1(ab);
        b1(ab);
    }
}