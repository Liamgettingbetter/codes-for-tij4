package polymorphism;

import static java.lang.System.out;
/**
 * Created by Liam on 13/11/2016.
 */
class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    @Override
    public void act() {
        out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    void change() {
        actor = new SadActor();
    }

    void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage s = new Stage();
        s.performPlay();
        s.change();
        s.performPlay();
    }
}
