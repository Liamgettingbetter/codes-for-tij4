package innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
public interface ClassInInterface {
    void howdy();
    // Test will automatically turns to static final class
    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
