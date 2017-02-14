package generics;

import generics.coffee.Generator;

/**
 * Created by Liam on 14/02/2017.
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    public T next() {
        try {
            return type.newInstance();
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Produce a Default generator given a type token
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }
}
