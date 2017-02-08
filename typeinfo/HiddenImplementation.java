package typeinfo;

import typeinfo.packageaccess.HiddenC;
import typeinfo.interfacea.A;
import java.lang.reflect.Method;

/**
 * Created by Liam on 08/02/2017.
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getSimpleName());
        // compile-time error : can't find symbol 'C'
        // if(a instanceof C)
        // Opps! Reflection still allows us to call g():
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a, String methodName)
            throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
