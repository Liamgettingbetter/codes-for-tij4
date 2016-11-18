package practice.innerclasses;

/**
 * Created by Liam on 18/11/2016.
 */
interface F {
    void f();
}


public class Practice11 {
    private class Fs implements F {
        @Override
        public void f() {
            System.out.println("Fs.f()");
        }
    }

    public Fs returnFs() {
        return new Fs();
    }

    public static void main(String[] args) {
        F f = new Practice11().returnFs();
        Fs a = (Fs)f;
    }
}
