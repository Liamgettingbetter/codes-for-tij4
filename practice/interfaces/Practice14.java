package practice.interfaces;

import static java.lang.System.out;

/**
 * Created by Liam on 15/11/2016.
 */
interface AA {
    void a();
    void aa();
}

interface BB {
    void b();
    void bb();
}

interface CC {
    void c();
    void cc();
}

interface DD extends AA, BB, CC {
    void d();
}

class Hello {
    void hello() {}
}

class Fuck extends Hello implements DD {
    @Override
    public void a() {
        out.println("a()");
    }

    @Override
    public void aa() {
        out.println("aa()");
    }

    @Override
    public void b() {
        out.println("b()");
    }

    @Override
    public void bb() {
        out.println("bb()");
    }

    @Override
    public void c() {
        out.println("c()");
    }

    @Override
    public void cc() {
        out.println("cc()");
    }

    @Override
    public void d() {
        out.println("d()");
    }
}

public class Practice14 {
    static void u(AA a) {
    }
}
