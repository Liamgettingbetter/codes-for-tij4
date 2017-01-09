package practice.typeinfo;


/**
 * Created by Liam on 08/01/2017.
 */
public class Practice8 {
    private static class A {}
    private static class B extends A {}
    private static class C extends B {}
    private static class D extends C {}
    private static class E extends D {}

    static void print(Class obj) {
        if(obj.getName().equals("java.lang.Object")) {
            System.out.println(obj.getName());
            return;
        }

        System.out.println(obj.getName());
        print(obj.getSuperclass());
    }

    public static void main(String[] args) {
        print(new E().getClass());
    }
}
