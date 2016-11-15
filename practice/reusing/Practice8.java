package practice.reusing;

/**
 * Created by Liam on 11/9/16.
 */
class E {
    E() {
        System.out.println("E()");
    }
}

class F extends E {
    F() {
        System.out.println("F()");
    }

    F(int i) {
        System.out.println("F(int)");
    }
}

public class Practice8 {
    public static void main(String[] args) {
        F f1 = new F();
        F f = new F(2);
    }
}
