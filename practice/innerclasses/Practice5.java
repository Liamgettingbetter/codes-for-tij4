package practice.innerclasses;

/**
 * Created by Liam on 18/11/2016.
 */
class OutClass {
    private class InnerClass {

    }
}

public class Practice5 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
    }
}
