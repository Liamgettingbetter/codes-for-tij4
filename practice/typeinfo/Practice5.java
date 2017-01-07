package practice.typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Liam on 07/01/2017.
 */
public class Practice5 {
    private static abstract class Shape {
        void draw() {
            System.out.println(this + ".draw()");
        }

        void rotate() {
            if(!(this instanceof Circle)) {
                System.out.println(this + " rotates ! ");
            }
        }

        @Override
        abstract public String toString();
    }

    private static class Circle extends Shape {
        @Override
        public String toString() {
            return "Circle";
        }
    }

    private static class Square extends Shape {
        @Override
        public String toString() {
            return "Square";
        }
    }

    private static class Triangle extends Shape {
        @Override
        public String toString() {
            return "Triangle";
        }
    }

    public static void main(String[] args) {
        List<Shape> list = Arrays.asList(
            new Triangle(), new Circle(), new Square());

        for(Shape s : list)
            s.rotate();
    }
}

