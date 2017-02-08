package generics;

import java.util.Random;
import java.util.ArrayList;

/**
 * Created by Liam on 08/02/2017.
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for(String s : "A Lannister always pays his debt.".split(" "))
            rs.add(s);

        for(int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
    }
}
