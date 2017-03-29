package design_patterns;

/**
 * Created by Liam on 29/03/2017.
 */
interface Human {
    void eat();
    void sleep();
    void play();
}

class Male implements Human {
    @Override
    public void eat() {
        System.out.println("Man eat.");
    }

    @Override
    public void sleep() {
        System.out.println("Man sleep.");
    }

    @Override
    public void play() {
        System.out.println("Man play.");
    }
}

class Female implements Human {
    @Override
    public void eat() {
        System.out.println("Female eat.");
    }

    @Override
    public void sleep() {
        System.out.println("Female sleep.");
    }

    @Override
    public void play() {
        System.out.println("Female play.");
    }
}

// Factory method
class HumanFactory {
    static Human create(String name) {
        switch(name) {
            case "Male":
                return new Male();
            case "Female" :
                return new Female();
            default:
                return null;
        }
    }
}

public class Factory {
    public static void main(String[] args) {
        Human h = HumanFactory.create("Male");
        h.eat();
        h.sleep();
        h.play();
    }
}
