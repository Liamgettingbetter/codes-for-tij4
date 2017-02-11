package practice.generics;

import generics.Fibonacci;
import java.util.Iterator;

/**
 * Created by Liam on 09/02/2017.
 */
public class Practice7 implements Iterable<Integer> {
    private int recursive_times = 0;
    private Fibonacci f;

    Practice7(int i, Fibonacci f) {
        this.recursive_times = i;
        this.f = f;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return recursive_times > 0;
            }

            @Override
            public Integer next() {
                recursive_times--;
                return f.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i : new Practice7(18, new Fibonacci()))
            System.out.print(i + " ");
    }
}
