package typeinfo;

/**
 * Created by Liam on 05/02/2017.
 */
public class WildcardClassReference {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        // by using wildcard, reference of type Class can be reassigned
        // to another Class object.
        intClass = double.class;
    }
}
