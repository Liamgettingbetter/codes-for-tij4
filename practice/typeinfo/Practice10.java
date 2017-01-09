package practice.typeinfo;

/**
 * Created by Liam on 09/01/2017.
 */
public class Practice10 {
    static boolean isObject(Object obj) {
        if(obj.getClass().isPrimitive())
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        char[] array = new char[10];
        System.out.println("char[] is an Object ? " + isObject(array));
    }
}
