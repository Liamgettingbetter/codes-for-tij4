package typeinfo;

/**
 * Created by Liam on 05/02/2017.
 */
class Building {}
class House extends Building {}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House house = houseType.cast(b);
        // or equivalent as below :
        house = (House)b;
    }
}
