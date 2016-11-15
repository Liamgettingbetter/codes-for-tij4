package practice.reusing;

/**
 * Created by Liam on 11/9/16.
 */
class A2 {
    A2(int i) {
        System.out.println("A2(int)");
    }
}

class B2 {
    B2(int i) {
        System.out.println("B2(int)");
    }
}

class C2 extends A2 {
    private B2 b;

    C2(int i) {
        super(i);
        System.out.println("C2(int)");
        this.b = new B2(i);
    }
}

public class Practice7 {
    public static void main(String[] args) {
        C2 c = new C2(11);
    }
}
