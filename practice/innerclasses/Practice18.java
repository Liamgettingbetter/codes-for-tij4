package practice.innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
public class Practice18 {
    private static class Liam {
        Liam() {
            System.out.println("Liam()");
        }
    }

    public static void main(String[] args) {
        Liam l = new Liam();
    }
}
