package exceptions;

import java.io.FileInputStream;

/**
 * Created by Liam on 09/12/2016.
 */
public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("MainException.java");
        // Use the file ...
        // Close the file ...
        file.close();
    }
}
