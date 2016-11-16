package practice.innerclasses;

/**
 * Created by Liam on 16/11/2016.
 */
class Outer {
    class Inner {}

    public Inner invoke() {
        return new Inner();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.invoke();
    }
}
