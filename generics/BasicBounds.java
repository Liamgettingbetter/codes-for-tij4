package generics;

import java.awt.Color;

/**
 * Created by Liam on 05/03/2017.
 */
interface HasColor {
    Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    Colored(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    // The bound allows you to call a method.
    Color color() {
        return item.getColor();
    }
}

class Dimension {
    int x, y, z;
}

// Multiple bounds :
class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    ColoredDimension(T item) {
        this.item = item;
    }

    T getItem() {
        return this.item;
    }

    Color color() {
        return item.getColor();
    }

    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }
}

interface Weight {
    int weight();
}

// As with inheritance, you can have only one
// concrete class but multiple interfaces:
class Solid<T extends Dimension & HasColor & Weight> {
    T item;

    Solid(T item) {
        this.item = item;
    }

    T getItem() {
        return this.item;
    }

    Color color() {
        return item.getColor();
    }

    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }

    // delegation
    int weight() { return item.weight(); }
}

class Bounded extends Dimension implements HasColor, Weight {
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}

public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid =
                new Solid<>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }
}
