package practice.reusing;

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

class Cartoon extends Drawing {

    // 不是构造函数
    public static void Cartoon() {
        System.out.println("Cartoon()");
    }

}

public class Practice3 extends Cartoon {
    public Practice3() {
        System.out.println("Practice3() ");
    }

    public static void main(String[] args) {
        //Practice3 p = new Practice3();
        Cartoon.Cartoon();
    }

}
