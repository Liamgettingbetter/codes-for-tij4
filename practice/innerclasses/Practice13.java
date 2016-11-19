package practice.innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
interface A1 {
    void a();
}

public class Practice13 {
    public A1 f() {
        return new A1() {
            @Override
            public void a() {
                System.out.println("f()->a");
            }
        };
    }

    public static void main(String[] args) {
        Practice13 p = new Practice13();
        p.f().a();
    }
}
