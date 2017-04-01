package generics.decorator;

import java.util.Date;

/**
 * Created by Liam on 01/04/2017.
 */
class Basic {
    private String value;

    public void set(String val) { this.value = val; }
    public String get() { return value; }
}

class Decorator extends Basic {
    protected Basic basic;

    public Decorator(Basic b) {
        this.basic = b;
    }

    @Override
    public void set(String val) {
        basic.set(val);
    }

    @Override
    public String get() {
        return basic.get();
    }
}

class TimeStamped extends Decorator {
    private final long timeStamp;

    public TimeStamped(Basic b) {
        super(b);
        timeStamp = new Date().getTime();
    }

    public long getStamp() {
        return this.timeStamp;
    }
}

class SerialNumbered extends Decorator {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public SerialNumbered(Basic b) {
        super(b);
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}

public class Decoration {
    public static void main(String[] args) {
        TimeStamped t = new TimeStamped(new Basic());
        TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));

        // t2.getSerialNumber();
        SerialNumbered s = new SerialNumbered(new Basic());
        SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));
        // s2.getStamp();
    }
}