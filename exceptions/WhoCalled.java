package exceptions;

/**
 * Created by Liam on 03/12/2016.
 */
public class WhoCalled {
    static void f() {
        // Generate an exception to fill in the stack trace
        try {
            throw new Exception();
        }
        catch(Exception e) {
            for(StackTraceElement ele : e.getStackTrace())
                System.out.println(ele.getMethodName());
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("-----------------------");
        g();
        System.out.println("-----------------------");
        h();
    }
}
