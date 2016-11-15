package initialization;

/**
 * Created by Liam on 11/4/16.
 */
class B {}
class C {}

public class NewVarArgs {
    static void print(Object... objs) {
       for(Object o : objs)
           System.out.print(o + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        print(new Integer(11), new Float(3.14), new Double(11.11));
        print("one", "two", "three");
        print(11, 3.14F, 11.11);
        print(new A(), new B(), new C());
        print();
    }
}
