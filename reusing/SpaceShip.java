package reusing;

/**
 * Created by Liam on 11/9/16.
 */
public class SpaceShip extends SpaceShipControl {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NASA Protector");
        protector.forward(100);
    }
}
