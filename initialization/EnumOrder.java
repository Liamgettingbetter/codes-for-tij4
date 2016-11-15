package initialization;

/**
 * Created by Liam on 11/5/16.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values())
            System.out.print(s + " ordinal " + s.ordinal() + "\n");

    }
}
