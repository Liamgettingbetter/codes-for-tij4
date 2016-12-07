package exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


/**
 * Created by Liam on 07/12/2016.
 */
public class InputFile {
    private BufferedReader br;

    public InputFile(String fname) throws Exception {
        try {
            br = new BufferedReader(new FileReader(fname));
            // Other code that may throw exception
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            // File was not open, so don't close it here
            throw e;
        }
        catch(Exception e) {
            // All other exceptions must close it
            try {
                br.close();
            }
            catch(IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;    // Rethrow
        }
        finally {
            // Don't close io stream here !
        }
    }

    public String getLine() {
        String line;
        try {
            line = br.readLine();
        }
        catch(IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return line;
    }

    public void dispose() {
        try {
            br.close();
            System.out.println("dispose() successful");
        }
        catch(IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
