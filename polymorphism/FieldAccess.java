package polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 12/11/2016.
 */
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        /*
            可以看出，下面的sup.field因为进行了upcast
            所以sup访问的是Super类的field，此处多态也失效了
         */
        out.println("sup.field = " + sup.field +
            ", sup.getField() = " + sup.getField());

        Sub sub = new Sub();
        out.println("sub.field = " + sub.field +
            ", sub.getField() = " + sub.getField() +
            ", sub.getSuperField = " + sub.getSuperField());
    }
}
