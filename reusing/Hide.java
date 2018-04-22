package reusing;

import static java.lang.System.out;

/**
 * Created by Liam on 11/10/16.
 */
class Homer {
    char doh(char c) {
        out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {}

class Bart extends Homer {
    /* 导出类里的方法重载现象 */
    void doh(Milhouse m) {
        out.println("doh(Milhouse)");
    }

    /* 导出类中的方法覆盖现象 */
    @Override
    char doh(char c) {
        out.println("Bart.doh(char)");
        return c;
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
