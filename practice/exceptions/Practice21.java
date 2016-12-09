package practice.exceptions;

/**
 * Created by Liam on 09/12/2016.
 */
class Base {
    protected Base() throws Exception {
        System.out.println("Base()");
        throw new Exception();
    }
}

//public class Practice21 extends Base {
//    Practice21() {
//        try {
//            super();
//        }
//        catch (Exception e) {
//            System.out.println("Sub class construction");
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
