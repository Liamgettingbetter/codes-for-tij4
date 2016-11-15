package practice.reusing;

/**
 * Created by Liam on 11/10/16.
 */
class Animal {
    void A() {
        System.out.println("A()");
    }

    void A(float f) {
        System.out.println("A(float)");
    }

    void A(int i) {
        System.out.println("A(int)");
    }
}

class Dog extends Animal {
    void A(double f) {
        System.out.println("A(double)");
    }
}

public class Practice13 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.A();
        d.A(1);
        d.A(1.0f);
        d.A(1.11);
    }
}
