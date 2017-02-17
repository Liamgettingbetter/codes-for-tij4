package practice.generics;

import generics.Generators;
import generics.coffee.Generator;

import java.util.*;

/**
 * Created by Liam on 17/02/2017.
 */
class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {}

    @Override
    public String toString() {
        return "BigFish " + id;
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish() {}

    @Override
    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<LittleFish> gen =
            new Generator<LittleFish>() {
                @Override
                public LittleFish next() {
                    return new LittleFish();
                }
            };
}

public class Practice18 {
    public static void eat(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eats " + lf);
    }

    public static void main(String[] args) {
        Random rand = new Random(8);
        List<BigFish> bigfishes = new ArrayList<>();
        Generators.fill(bigfishes, BigFish.generator(), rand.nextInt(30));
        List<LittleFish> littlefishes = new LinkedList<>();
        Generators.fill(littlefishes, LittleFish.gen, rand.nextInt(100));

        for(LittleFish lf : littlefishes)
            eat(bigfishes.get(rand.nextInt(bigfishes.size())), lf);
    }
}
