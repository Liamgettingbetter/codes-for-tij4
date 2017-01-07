package practice.typeinfo;

/**
 * Created by Liam on 07/01/2017.
 */
public class Practice4 {
    public static void main(String[] args) {
        Shape s = new Rhomboid();
        Rhomboid r = (Rhomboid)s;

        if(s instanceof Circle) {
            Circle c = (Circle)s;
        }
    }
}
