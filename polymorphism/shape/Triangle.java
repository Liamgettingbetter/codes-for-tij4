package polymorphism.shape;

import static java.lang.System.out;

/**
 * Created by Liam on 11/11/2016.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        out.println("Triangle.erase()");
    }
}
