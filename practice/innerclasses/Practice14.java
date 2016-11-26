package practice.innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class Practice14 {
    static void u(Monster monster) {
        monster.menace();
    }

    static void v(DangerousMonster dm) {
        dm.menace();
        dm.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster dm = new DangerousMonster() {
            @Override
            public void destroy() {}

            @Override
            public void menace() {}
        };
        u(dm);
        v(dm);

        Vampire v = new Vampire() {
            @Override
            public void drinkBlood() {}

            @Override
            public void destroy() {}

            @Override
            public void kill() {}

            @Override
            public void menace() {}
        };
        u(v);
        v(v);
        w(v);
    }
}
