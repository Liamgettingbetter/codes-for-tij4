package practice.innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
interface I {
    void g();

    class Nested {
        static void show(I i) {
            i.g();
        }
    }
}

public class Practice21 implements I {
    @Override
    public void g() {
        System.out.println("Practice21.g()");
    }

    public static void main(String[] args) {
        Practice21 p = new Practice21();
        I.Nested.show(p);
    }
}
