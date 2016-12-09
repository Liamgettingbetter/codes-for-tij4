package practice.exceptions;

/**
 * Created by Liam on 09/12/2016.
 */
public class Practice23 {
    private static class FailingConstructor {
        private FailingConstructor f;

        FailingConstructor(FailingConstructor f) throws Exception {
            try {
                this.f = f;
            }
            catch(Exception e) {
                System.out.println("Construction failed inside");
            }
            throw new Exception("constructor");
        }

        private void dispose() {
            System.out.println("dispose " + this.toString());
        }
    }

    public static void main(String[] args) {
        try {
            //FailingConstructor f1 = new FailingConstructor();
            try {
                // some operations
            }
            finally {
            //    f1.dispose();
            }
        }
        catch(Exception e) {
            System.out.println("Construction failed.");
        }
    }
}