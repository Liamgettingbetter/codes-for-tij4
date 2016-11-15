package polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 12/11/2016.
 */
class Derived extends PrivateOverride {
    public void f() {
        out.println("public f()");
    }
}

public class PrivateOverride {
    private void f() {
        out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride p = new Derived();
        /*
            此处的f()是私有的，导出类不可见。
            因此导出类里面的同名方法并没有覆盖基类的f()
            也不是f()的重载方法
            导出类中的该方法只是一个"恰好"重名的方法
            因此，这里多态（动态绑定）失效了。
         */
        p.f();
    }
}
