package innerclasses;

/**
 * Created by Liam on 18/11/2016.
 */
public class DotNew {
    public class Inner {}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        // 通过外部类对象.new 的方式可以创建一个
        // 包含在该外部类里面的内部类对象
        DotNew.Inner dni = dn.new Inner();
    }
}
