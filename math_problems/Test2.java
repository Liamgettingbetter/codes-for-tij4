package math_problems;

/**
 * Created by Liam on 20/05/2017.
 */
public class Test2 {
    static class Test {
        public static void main(String[] args) {
            String hello = "Hello";
            String lo = "lo";

            System.out.println(hello == "Hello");
            System.out.println(Other.hello == hello);
            System.out.println(hello == ("Hel" + "lo"));
            System.out.println(hello == ("Hel" + lo));
            System.out.println(hello == ("Hel" + lo).intern());
        }
    }

    static class Other {
        static String hello = "Hello";
    }
}
