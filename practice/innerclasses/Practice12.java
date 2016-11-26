package practice.innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
class Outers1 {
    private int i = 11;

    public void print() {
        System.out.println(i);
    }

    public void f() {
        new Outers1() {
            // private int i = 1;

            void setter(int i) {
                super.i = i;
                print();
            }
        }.setter(121);
    }
}
public class Practice12 {
    public static void main(String[] args) {
        Outers1 os1 = new Outers1();
        os1.f();
    }
}
