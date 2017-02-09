package generics.coffee;

import java.util.Random;
import java.util.Iterator;

/**
 * Created by Liam on 09/02/2017.
 */
public class CoffeeGenerator
        implements Generator<Coffee>, Iterable<Coffee>
{
    private Class[]       types = {
        Latte.class,     Mocha.class, Cappuccino.class,
        Americano.class, Breve.class, };
    private static Random rand  = new Random(47);

    // For iteration :
    private int size = 0;

    public CoffeeGenerator() {}

    public CoffeeGenerator(int sz) {
        this.size = sz;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }


    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(Coffee c : new CoffeeGenerator(5))
            System.out.println(c);
    }
}

