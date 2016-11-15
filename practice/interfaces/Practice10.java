package practice.interfaces;

import java.util.Random;
import polymorphism.music.Note;
import polymorphism.shape.RandomShapeGenerator;

import static java.lang.System.out;

/**
 * Created by Liam on 14/11/2016.
 */
interface Instrument {
    void adjust();
}

interface Playable {
    void play(Note n);
}

class Wind implements Instrument, Playable {
    @Override
    public void play(Note n) {
        out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument, Playable {
    @Override
    public void play(Note n) {
        out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        out.println(this + ".adjust() ");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument, Playable {
    @Override
    public void play(Note n) {
        out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

class RandomPlayableGen {
    private Random rand = new Random(12);

    Playable generate() {
        switch(rand.nextInt(5)) {
            case 0 : return new Wind();
            case 1 : return new Percussion();
            case 2 : return new Stringed();
            case 3 : return new Brass();
            case 4 : return new Woodwind();
            default : return null;
        }
    }
}

public class Practice10 {
    static void tune(Playable p) {
        p.play(Note.C_SHARP);
    }

    static void tuneAll(Playable[] ps) {
        for(Playable p : ps)
            tune(p);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        RandomPlayableGen g = new RandomPlayableGen();
        Playable[] ps = new Playable[rand.nextInt(10)];

        /*
           for(Playable p : ps) {
              p = g.generate();
           }
           此处无法通过以上方式对对象引用数组进行赋值
           因为p 是一个临时对象引用，在循环结束一次后便会被回收
        */
        for(int i = 0; i < ps.length; ++i)
            ps[i] = g.generate();

        for(Playable p : ps)
            tune(p);
        //tuneAll(ps);
    }
}
