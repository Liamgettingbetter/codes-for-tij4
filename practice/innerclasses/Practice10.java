package practice.innerclasses;

/**
 * Created by Liam on 18/11/2016.
 */
interface As {
    void a();
}

public class Practice10 {
    public As print() {
        if(true) {
            class B implements As {
                @Override
                public void a() {
                    System.out.println("print()-->B.a()");
                }
            }
            return new B();
        }
        else return null;
    }

    public static void main(String[] args) {
        Practice10 p = new Practice10();
        p.print().a(); // polymorphism occurs!
    }
}
