package polymorphism;

import static java.lang.System.out;

/**
 * Created by Liam on 12/11/2016.
 */
class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        out.println("Creating Characteristic " + s);
    }

    // 自己设计对象的销毁方法
    protected void dispose() {
        out.println("disposing Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        out.println("Creating Description " + s);
    }

    protected void dispose() {
        out.println("disposing Description " + s);
    }
}

class LivingCreature {
    private Characteristic p =
            new Characteristic("is alive");
    private Description t =
            new Description("Basic Living Creature");

    LivingCreature() {
        out.println("LivingCreature()");
    }

    protected void dispose() {
        out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic c =
            new Characteristic("has heart");
    private Description d =
            new Description("Animal not Vegetable");

    Animal() {
        out.println("Animal()");
    }

    @Override
    protected void dispose() {
        out.println("Animal dispose");
        d.dispose();
        c.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic c =
            new Characteristic("can live in water");
    private Description d =
            new Description("Both water and land");

    Amphibian() {
        out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        out.println("Amphibian dispose");
        d.dispose();
        c.dispose();
        super.dispose();
    }
}


public class Frog extends Amphibian {
    private Characteristic c =
            new Characteristic("Croaks");
    private Description d =
            new Description("Eats Bugs");

    public Frog() {
        out.println("Frog()");
    }

    @Override
    protected void dispose() {
        out.println("Frog dispose");
        d.dispose();
        c.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        out.println("Bye");
        f.dispose();
    }
}
