package generics;

/**
 * Created by Liam on 08/02/2017.
 */
public class Holder2 {
    private Object a;

    public Holder2(Object obj) {
        this.a = obj;
    }

    public void set(Object obj) {
        this.a = obj;
    }

    public Object get() {
        return this.a;
    }

    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        Automobile a = (Automobile)h2.get();
        h2.set("Not an automobile");
        String s = (String)h2.get();
        h2.set(1);
        Integer i = (Integer)h2.get();
    }
}
