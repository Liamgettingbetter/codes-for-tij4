package practice.innerclasses;

/**
 * Created by Liam on 20/11/2016.
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    Sequence(int size) {
        items = new Object[size];
    }

    void add(Object item) {
        if(next < items.length)
            items[next++] = item;
    }

    private class ReverseSelector implements Selector {
        private int index = next - 1;

        @Override
        public boolean end() {
            return index == 0;
        }

        @Override
        public Object current() {
            return items[index];
        }

        @Override
        public void next() {
            if(index > 0)
                index--;
        }
    }

    Selector make() {
        return new ReverseSelector();
    }

}

public class Practice22 {
    public static void main(String[] args) {
        Sequence s = new Sequence(10);

        for(int i = 0; i < 10; i++) {
            s.add(Integer.toString(i));
        }

        Selector ss = s.make();

        while(!ss.end()) {
            System.out.print(ss.current() + " ");
            ss.next();
        }
    }
}
