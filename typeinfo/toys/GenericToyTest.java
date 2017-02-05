package typeinfo.toys;

/**
 * Created by Liam on 05/02/2017.
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // Produce exact code
        FancyToy fToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // Only produce object
        Object obj = up.newInstance();
    }
}
