package interfaces;

/**
 * Created by Liam on 15/11/2016.
 */
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter
    implements CanFight, CanSwim, CanFly {
    /*
        Hero通过继承ActionCharacter接收了其fight()方法
        然而因为该方法与Hero实现的CanFight接口中的方法使用了相同的签名
        因此继承的fight()方法"实现"了CanFight接口中的fight()方法
     */
    @Override
    public void swim() {}

    @Override
    public void fly() {}
}


public class Adventure {
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void w(ActionCharacter x) { x.fight(); }
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);   // Treat it as a CanFight
        u(h);   // Treat it as a CanSwim
        v(h);   // Treat it as a CanFly
        w(h);   // Treat it as a ActionCharacter
    }
}
