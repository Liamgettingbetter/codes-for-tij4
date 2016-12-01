package practice.exceptions;

/**
 * Created by Liam on 01/12/2016.
 */
public class Practice1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Liam");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This code block has been invoked yet");
        }
    }
}
