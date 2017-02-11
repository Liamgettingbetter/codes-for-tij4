package practice.generics.practice8;

import java.util.Random;
import java.util.Iterator;

interface Generator<T> {
    T next();
}

class StoryCharacters {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

class GoodGuys extends StoryCharacters {}
class BadGuys extends StoryCharacters {}

class Batman extends GoodGuys {}
class Ironman extends GoodGuys {}
class Spiderman extends GoodGuys {}
class Hydra extends BadGuys {}
class Altron extends BadGuys {}
class WinterSoldier extends BadGuys {}

public class Practice8 implements Generator<StoryCharacters>,
        Iterable<StoryCharacters> 
{
    private int size = 0;
    private Random rand = new Random(47);

    private Class[] types = {
            Batman.class, Ironman.class,
            Hydra.class, Altron.class,
            WinterSoldier.class, Spiderman.class
    };

    public Practice8(int i) {
        this.size = i;
    }

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters)types[rand.nextInt(types.length)].newInstance();
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new Iterator<StoryCharacters>() {
            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public StoryCharacters next() {
                size--;
                return Practice8.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(StoryCharacters sc : new Practice8(5))
            System.out.println(sc);

    }
}
