package practice.exceptions;

/**
 * Created by Liam on 09/12/2016.
 */
public class Practice22 {
    private static class FailingConstructor {
        FailingConstructor() throws Exception {}
    }

    public static void main(String[] args) {
        try {
            FailingConstructor f = new FailingConstructor();
        }
        catch(Exception e) {
            System.out.println("construction failed.");
        }
    }
}
