package polymorphism.shape;

import java.util.Random;

/**
 * Created by Liam on 11/11/2016.
 * 随机生成对象并通过return将对象引用作为返回值返回给调用方法
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch(rand.nextInt(3)) {
            default :
            case 0 : return new Circle();
            case 1 : return new Square();
            case 2 : return new Triangle();
        }
    }
}
