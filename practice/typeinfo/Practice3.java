package practice.typeinfo;

/**
 * Created by Liam on 07/01/2017.
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Shape s = new Rhomboid();
        Rhomboid r = (Rhomboid)s;
        Circle c = (Circle)s;
    }
}