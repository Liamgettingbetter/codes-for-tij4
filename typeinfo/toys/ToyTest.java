package typeinfo.toys;

import static java.lang.System.out;

/**
 * Created by Liam on 31/12/2016.
 */
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy
    implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1); }
}

public class ToyTest {
    static void printInfo(Class c) {
        out.println("Class name : " + c.getName() +
            " is interface? [" + c.isInterface() + "]");
        out.println("Simple name : " + c.getSimpleName());
        out.println("Canonical name : " + c.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("typeinfo.toys.FancyToy");
        }
        catch(ClassNotFoundException e) {
            out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor:
            obj = up.newInstance();
        }
        catch(InstantiationException e) {
            out.println("Can not instantiate");
            System.exit(1);
        }
        catch(IllegalAccessException e) {
            out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
