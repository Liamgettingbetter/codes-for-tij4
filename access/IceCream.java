package access;

/**
 * Created by Liam on 11/8/16.
 */
class Sundae {
    /*
        Singleton 模式 ：
            通过将构造器私有化，然后提供一个静态方法
            该方法包装一个new 对象的方法，对外提供唯一的对象
     */
    private Sundae() {}

    static Sundae makeASundae() {
        return new Sundae();
    }
}
public class IceCream {
    public static void main(String[] args) {
        // Sundae a = new Sundae() --- 传统的对象构造方法这里就不能使用了
        Sundae s = Sundae.makeASundae();
    }
}
