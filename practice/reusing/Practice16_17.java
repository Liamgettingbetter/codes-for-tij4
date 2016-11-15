package practice.reusing;

/**
 * Created by Liam on 11/10/16.
 */
class Amphibian {
    protected void swim() {
        System.out.println("Amphibian can swim");
    }

    protected void creep() {
        System.out.println("Amphibian can creep");
    }
}

class Frog extends Amphibian {
    @Override
    protected void creep() {
        System.out.println("Frog can creep");
    }

    @Override
    protected void swim() {
        System.out.println("Frog can swim");
    }

}

public class Practice16_17 {
    public static void main(String[] args) {
        Frog f = new Frog();
        /*
            在子类Frog没有覆盖基类的同名方法时
            若子类调用这些方法，将进行向上转型;ß
         */
        f.swim();
        f.creep();
    }
}
