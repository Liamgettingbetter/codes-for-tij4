package practice.polymorphism;

/**
 * Created by Liam on 13/11/2016.
 */
class AlertStatus {
    void status() {}
}

class Red extends AlertStatus {
    @Override
    void status() {
        System.out.println("Status : Red");
    }
}

class Yellow extends AlertStatus {
    @Override
    void status() {
        System.out.println("Status : Yellow");
    }
}

class Green extends AlertStatus {
    @Override
    void status() {
        System.out.println("Status : Green");
    }
}

class StarShips {
    private AlertStatus as;

    void shiftRed() {
        as = new Red();
    }

    void shiftYellow() {
        as = new Yellow();
    }

    void shiftGreen() {
        as = new Green();
    }

    void showStatus() {
        as.status();
    }
}

public class Practice16 {
    public static void main(String[] args) {
        StarShips s = new StarShips();
        s.shiftRed();
        s.showStatus();
        s.shiftGreen();
        s.showStatus();
        s.shiftYellow();
        s.showStatus();
    }
}
