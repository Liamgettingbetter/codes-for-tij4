package polymorphism.shape;

import static java.lang.System.out;

/**
 * Created by Liam on 11/11/2016.
 */
public class Square extends Shape {
    @Override
    public void draw() {
        out.println("Square.draw()");
    }

    @Override
    public void erase() {
        out.println("Square.erase()");
    }
}
