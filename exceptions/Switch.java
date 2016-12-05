package exceptions;

/**
 * Created by Liam on 05/12/2016.
 */
public class Switch {
    private boolean state = false;

    public boolean read() { return state; }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}
