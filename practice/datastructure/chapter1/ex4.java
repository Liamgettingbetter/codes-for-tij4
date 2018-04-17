package practice.datastructure.chapter1;

import java.util.Scanner;

public class ex4 {
    static boolean isEven(int i) {
        int temp = i;
        int y = (i >>> 1) << 1;
        return (temp & y) == temp;

    }

    public static void main(String[] args) {

        while(true) {
            System.out.println("ENTER a Number :");

            Scanner in = new Scanner(System.in);
            boolean temp = isEven(in.nextInt());

            if (temp)
                System.out.println("This number is even number.");
            else
                System.out.println("This number is odd number.");
        }
    }
}
