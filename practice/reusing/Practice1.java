package practice.reusing;

/**
 * Created by Liam on 11/9/16.
 */
class Delay {
    private int i;

    Delay(int i) { this.i = i; }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

public class Practice1 {
    private Delay d;

    @Override
    public String toString() {
        // 延迟初始化的实际应用
        if(d == null) d = new Delay(44);
        return d.toString();
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        System.out.println(p);
    }
}
