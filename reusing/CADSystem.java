package reusing;

import static java.lang.System.out;

/**
 * Created by Liam on 11/10/16.
 */
class Shape {
    Shape(int i) {
        out.println("Shape constructor");
    }

    void dispose() {
        out.println("Shape dispose");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        out.println("Circle constructor");
    }

    @Override
    void dispose() {
        out.println("Circle dispose");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        out.println("Triangle dispose");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        out.println("Drawing Line : " + start + ", " + end);
    }

    @Override
    void dispose() {
        out.println("Erasing Line : " + start + ", " + end);
        super.dispose();
    }
}

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j * j);
        c = new Circle(1);
        t = new Triangle(1);
        out.println("Combined constructor");
    }

    @Override
    public void dispose() {
        out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for(int i = 0; i < lines.length; ++i)
            lines[i].dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);

        try {
            // CODE and exception handling
        } finally {
            x.dispose();
        }
    }
}
