package design_patterns;

/**
 * Created by Liam on 31/03/2017.
 */
public class Singleton {
    public static Singleton instance = null;

    // Constructor must be private,
    // in case outsiders can't access it.
    private Singleton() {}

    private static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public static Singleton create() {
        return getInstance();
    }
}
