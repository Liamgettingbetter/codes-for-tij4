package generics;

/**
 * Created by Liam on 20/02/2017.
 */
public class SimpleHolder {
    private Object obj;

    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get() {
        return this.obj;
    }

    public static void main(String[] args) {
        SimpleHolder sh = new SimpleHolder();
        sh.set("Item");
        String s = (String)sh.get();
    }
}
