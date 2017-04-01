package generics;

import java.util.Date;

/**
 * Created by Liam on 01/04/2017.
 */
interface TimeStamped { long getStamp(); }
interface SerialNumbered { long getSerialNumber(); }
interface Basic {
    void set(String val);
    String get();
}

class TimeStampedImp implements TimeStamped {
    private final long timeStamp;

    public TimeStampedImp() {
        timeStamp = new Date().getTime();
    }


    @Override
    public long getStamp() {
        return timeStamp;
    }
}

class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}

class BasicImp implements Basic {
    private String value;

    @Override
    public void set(String val) {
        this.value = val;
    }

    @Override
    public String get() {
        return this.value;
    }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber = new SerialNumberedImp();

    @Override
    public long getStamp() { return timeStamp.getStamp(); }

    @Override
    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }
}

public class Mixins {
    Mixin mixin1 = new Mixin();
    Mixin mixin2 = new Mixin();

//    mixin2.set("test string 2");

//    System.out.println(m1.get())
}
