package initialization;

/**
 * Created by Liam on 11/4/16.
 */
public class DynamicArray {
    public static void main(String[] args) {
        Others.main("The", "Assassin's", "Creed", "the",
                "Renaissance");
    }
}

class Others {
    public static void main(String... args) {
        for(String s : args) {
            System.out.print(s + " ");
        }
    }
}
