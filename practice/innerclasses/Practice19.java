package practice.innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
public class Practice19 {
    private static class Doom {
        private static class Boom{
            private static class EndOfWorld {
                static void print() {
                    System.out.println("This is the end of the world.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Doom.Boom.EndOfWorld.print();
    }
}
