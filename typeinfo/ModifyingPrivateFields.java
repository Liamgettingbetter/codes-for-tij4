package typeinfo;

import java.lang.reflect.Field;

/**
 * Created by Liam on 08/02/2017.
 */
class WithPrivateFinalField {
    private int i = 1;
    private final String s = "I'm totally safe";
    private String s2 = "Am I safe ?";

    @Override
    public String toString() {
        return "i = " + i + ", " + s + ", " + s2;
    }
}

public class ModifyingPrivateFields {
    public static void main(String[] args) throws Exception {
        WithPrivateFinalField pf = new WithPrivateFinalField();
        System.out.println(pf);
        System.out.println();

        Field f = pf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println("f.getInt(pf) : " + f.getInt(pf));
        f.setInt(pf, 47);
        System.out.println(pf);
        System.out.println();

        f = pf.getClass().getDeclaredField("s");
        f.setAccessible(true);
        System.out.println("f.get(pf) : " + f.get(pf));
        // can not change a final String.
        f.set(pf, "No, you're not!");
        System.out.println(pf);
        System.out.println();


        f = pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f.get(pf) : " + f.get(pf));
        f.set(pf, "No, you're not ! ");
        System.out.println(pf);
        System.out.println();
    }
}
