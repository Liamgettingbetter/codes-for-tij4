package reusing;

/**
 * Created by Liam on 11/9/16.
 */
class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String v1, v2, v3, v4;
    private WaterSource ws = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return
            "value1 = " + v1 + " " +
            "value2 = " + v2 + " " +
            "value3 = " + v3 + " " +
            "value4 = " + v4 + "\n" +
            "int = " + i + " " + "float = " + f + " " +
            "source = " + ws;
    }

    public static void main(String[] args) {
        SprinklerSystem s = new SprinklerSystem();
        System.out.println(s);
    }
}
