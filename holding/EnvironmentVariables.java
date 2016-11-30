package holding;

import java.util.Map;

/**
 * Created by Liam on 30/11/2016.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
                entry.getValue());
        }
    }
}
