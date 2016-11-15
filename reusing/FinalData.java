package reusing;

import java.util.Random;

/**
 * Created by Liam on 11/10/16.
 */
class Value {
    int i;  // Package access

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    // static final 标示的域为编译时常量，
    // 因此必须要手动为其初始化
    private static final Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // Can be compile-time constants
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Typical public constant :
    public final static int VALUE_THREE = 39;
    // Can not be compile-time constants
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private final static Value VAL_3 = new Value(33);

    // Arrays :
    private final int[] a = { 1, 2, 3, 4, 5, 6 };

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //! fd1.valueOne++ --- valueOne is final, it can not be changed during runtime
        fd1.v2.i++; // Object is not constant
        fd1.v1 = new Value(9);  // OK, not final
        for(int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++; // Object is not constant
        //! fd1.v2 = new Value(0); --- can not change v2, cuz it is final
        //! fd1.VAL_3 = new Value(1); --- can not change reference
        //! fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
