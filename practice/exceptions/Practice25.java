package practice.exceptions;

/**
 * Created by Liam on 09/12/2016.
 */
class BaseException extends Exception {}
class SecondOrderException extends BaseException {}
class ThirdOrderException extends SecondOrderException {}

class A {
    protected void a() throws BaseException {
        throw new BaseException();
    }
}

class B extends A {
    @Override
    protected void a() throws SecondOrderException {
        throw new SecondOrderException();
    }
}

class C extends B {
    protected void a() throws ThirdOrderException {
        throw new ThirdOrderException();
    }
}

public class Practice25 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.a();
        }
        catch(BaseException e) {
            System.out.println(e);
        }
    }
}
