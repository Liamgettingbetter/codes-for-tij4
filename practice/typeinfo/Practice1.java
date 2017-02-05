package practice.typeinfo;

import java.util.Scanner;

/**
 * Created by Liam on 05/01/2017.
 */
public class Practice1 {
    private static class Toy {
        Toy(int i) {};
    }

    public static void main(String[] args) {
        try {
            Class c = Class.forName("practice.typeinfo.Practice1.Toy");
            Object obj = c.newInstance();
        }
        catch(ClassNotFoundException e) {
            System.out.println("Can not find class.");
            System.exit(1);
        }
        catch(InstantiationException e) {
            e.printStackTrace();
        }
        catch(IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
