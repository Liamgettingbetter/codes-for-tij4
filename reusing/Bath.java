package reusing;

/**
 * Created by Liam on 11/9/16.
 */
class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Bath {
    private String
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float f;

    public Bath() {
        System.out.println("Bath()");
        s3 = "Joy";
        f = 3.14f;
        castille = new Soap();
    }

    // 实例块初始化 Instance Initialization
    { i = 47; }

    @Override
    public String toString() {
        if(s4 == null)
            s4 = "Joy"; // Delayed Initialization 延迟初始化，当需要用到该对象时才初始化
        return
            "s1 = " + s1 + "\n" +
            "s2 = " + s2 + "\n" +
            "s3 = " + s3 + "\n" +
            "s4 = " + s4 + "\n" +
            "i = " + i + "\n" +
            "f = " + f + "\n" +
            "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
