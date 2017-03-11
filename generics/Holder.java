package generics;

/**
 * Created by Liam on 11/03/2017.
 */
public class Holder<T> {
    private T value;

    public Holder() {}
    public Holder(T val) {
        this.value = val;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        // Holder<Fruit> f = apple;
        Holder<? extends Fruit> f = apple;
        Fruit p = f.get();
        d = (Apple)f.get(); // Returns 'Object'

        try {
            Orange c = (Orange)f.get();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        // f.set(new Apple());
        // f.set(new Fruit());
        System.out.println(f.equals(d));    // OK
    }
}
