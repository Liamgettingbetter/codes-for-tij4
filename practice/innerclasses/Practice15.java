package practice.innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
class Z {
    private int name;

    public Z(int i) {
        this.name = i;
    }

    void print() {
        System.out.println(name);
    }
}

class ZZ {
    public Z returnZ(int i) {
        return new Z(i) {};
    }
}

public class Practice15 {
    public static void main(String[] args) {
        Z z = new ZZ().returnZ(1212);
        z.print();
    }
}
