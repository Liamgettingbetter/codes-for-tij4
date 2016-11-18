package practice.innerclasses;

import static java.lang.System.out;

/**
 * Created by Liam on 18/11/2016.
 */
class Outers {
    private int i = 11;

    private void print() {
        out.println(i);
    }

    private class Inner {
        private int i = 1;
        void setter(int i) {
            Outers.this.i = i;
            print();
        }
    }

    public void f() {
        Inner i = new Inner();
        i.setter(121);
    }
}

public class Practice7 {
    public static void main(String[] args) {
        Outers os = new Outers();
        os.f();
    }

}
