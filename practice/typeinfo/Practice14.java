package practice.typeinfo;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Liam on 06/02/2017.
 */
class Part {
    static List<Class<? extends Part>> classList =
            new ArrayList<>();

    static {
        classList.add(A.class);
        classList.add(B.class);
        classList.add(A1.class);
        classList.add(B1.class);
        classList.add(C.class);
    }

    private static Random rand = new Random(47);

    public static Part randomCreate() {
        int i = rand.nextInt(classList.size());
        try {
            return classList.get(i).newInstance();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

class A extends Part {
    @Override
    public String toString() {
        return "A";
    }
}
class B extends Part {
    @Override
    public String toString() {
        return "B";
    }
}

class A1 extends A {
    @Override
    public String toString() {
        return "A1";
    }
}
class B1 extends B {
    @Override
    public String toString() {
        return "B1";
    }
}
class C extends B {
    @Override
    public String toString() {
        return "C";
    }
}

public class Practice14 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(Part.randomCreate());
        }
    }
}
