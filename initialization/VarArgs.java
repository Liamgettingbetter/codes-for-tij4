package initialization;

/**
 * Created by Liam on 11/4/16.
 */
class A {}

public class VarArgs {
    static void printArray(Object[] args) {
        for(Object o : args) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[] {
            new Integer(11), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[] {
            "one", "two", "three"
        });
        printArray(new Object[] {
            new A(), new A(), new A()
        });
    }
}
