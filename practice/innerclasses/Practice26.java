package practice.innerclasses;

/**
 * Created by Liam on 22/11/2016.
 */
class Out {
    class Inner {
        Inner(String s) {
            System.out.println(s);
        }
    }
}

public class Practice26 {
    private class ExtendsInner extends Out.Inner {
        ExtendsInner(Out o) {
            o.super(new String("Hello World"));
        }
    }

    public static void main(String[] args) {
        Out o = new Out();
        Practice26 p26 = new Practice26();
        ExtendsInner ei = p26.new ExtendsInner(o);
    }
}
