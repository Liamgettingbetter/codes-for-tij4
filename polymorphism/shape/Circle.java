package polymorphism.shape;

import static java.lang.System.out;

/**
 * Created by Liam on 11/11/2016.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        out.println("Circle.erase()");
    }
}
