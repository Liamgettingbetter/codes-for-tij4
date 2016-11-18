package innerclasses;

/**
 * Created by Liam on 18/11/2016.
 */
public class Parcel5 {
    public Destination destination(String s) {
        // PDestination 是一个局部内部类
        // 其只在方法内部存在，外部类无法访问该类的域值
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                this.label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
