package practice.reusing;

import jdk.internal.cmm.SystemResourcePressureImpl;

/**
 * Created by Liam on 11/9/16.
 */
class Component1 {
    Component1() {
        System.out.println("Component1()");
    }

    void dispose() {
        System.out.println("Component1 dispose");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2()");
    }

    void dispose() {
        System.out.println("Component2 dispose");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3()");
    }

    void dispose() {
        System.out.println("Component3 dispose");
    }
}

class Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;

    Root() {
        System.out.println("Root()");
    }

    void dispose() {
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("Root dispose");
    }
}

class Stem extends Root {
    private Component1 c1;
    private Component2 c2;
    private Component3 c3;

    Stem() {
        System.out.println("Stem()");
    }

    @Override
    void dispose() {
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("Stem dispose");
        super.dispose();
    }

}

public class Practice9 {
    public static void main(String[] args) {
        Stem s = new Stem();
    }
}
