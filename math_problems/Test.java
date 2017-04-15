package math_problems;

/**
 * Created by Liam on 15/04/2017.
 */
class A {
    public static int count = 0;
    public final int id = count++;

    @Override
    public int hashCode() {
        return id;
    }
}

public class Test {
    public static void main(String[] args) {
        A a1 = new A(),
          a2 = a1,
          a3 = new A();

        System.out.println("a1.equals(a2) : " + a1.equals(a2));
        System.out.println("a1.equals(a3) : " + a1.equals(a3));
        System.out.println("a1 == a2 : " + (a1 == a2));
    }
}
