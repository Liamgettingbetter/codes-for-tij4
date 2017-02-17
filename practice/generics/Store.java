package practice.generics;

import generics.Generators;
import generics.coffee.Generator;
import java.util.*;

/**
 * Created by Liam on 17/02/2017.
 */
class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int IDnumber, String descr, double price) {
        this.id = IDnumber;
        this.description = descr;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: $" + price;
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Product> generator =
            new Generator<Product>() {
                private Random rand = new Random(12);

                @Override
                public Product next() {
                    return new Product(rand.nextInt(1000), "Test",
                            Math.round(rand.nextDouble() * 1000.0) + 0.99);
                }
            };
}

class Shelf extends ArrayList<Product> {
    public Shelf(int number) {
        Generators.fill(this, Product.generator, number);
    }
}

class Aisle extends ArrayList<Shelf> {
    public Aisle(int shelf_number, int product_number) {
        for(int i = 0; i < shelf_number; i++)
            add(new Shelf(product_number));
    }
}

class CheckoutStand {}
class Office {}

public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckoutStand> checkouts =
            new ArrayList<>();
    private Office office = new Office();

    public Store(int aisle_number, int shelf_number, int product_number) {
        for(int i = 0; i < aisle_number; i++)
            add(new Aisle(shelf_number, product_number));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Aisle a : this)
            for(Shelf s : a)
                for(Product p : s) {
                    sb.append(p);
                    sb.append("\n");
                }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 5, 10));
    }
}
