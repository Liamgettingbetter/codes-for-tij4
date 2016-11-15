package reusing;

/**
 * Created by Liam on 11/9/16.
 */
class Art {
    Art() {
        System.out.println("Art()");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing()");
    }
}

public class Cartoon extends Drawing {
    Cartoon() {
        System.out.println("Cartoon()");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
