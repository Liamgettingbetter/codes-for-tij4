package generics;

import java.util.Collection;
import java.util.ArrayList;

import generics.coffee.*;
import generics.coffee.Generator;

/**
 * Created by Liam on 14/02/2017.
 */
public class Generators {
    public static <T> Collection<T> fill(
        Collection<T> col, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            col.add(gen.next());
        return col;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
            new ArrayList<>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffee) {
            System.out.println(c);
        }

        Collection<Integer> fnumbers = fill(
            new ArrayList<>(), new Fibonacci(), 12);
        for(int i : fnumbers)
            System.out.print(i + " ");
    }
}
