package reusing;

/**
 * Java Design Pattern --- Delegation
 * Created by Liam on 11/9/16.
 */
public class SpaceShipDelegation {
    private String name;

    private SpaceShipControl control = new SpaceShipControl();

    public SpaceShipDelegation(String name) { this.name = name; }

    // Delegation Methods
    public void up(int velocity) {
        control.up(velocity);
    }

    public void down(int velocity) {
        control.down(velocity);
    }

    public void left(int velocity) {
        control.left(velocity);
    }

    public void right(int velocity) {
        control.right(velocity);
    }

    public void forward(int velocity) {
        control.forward(velocity);
    }

    public void back(int velocity) {
        control.back(velocity);
    }

    public void turboBoost() {
        control.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation delegation = new SpaceShipDelegation("NASA Protector");
        delegation.forward(100);
    }
}
