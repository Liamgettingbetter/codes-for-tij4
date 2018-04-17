package practice.datastructure.chapter1;

import java.util.Scanner;

public class ex1 {
    private static void inputAllBaseTypes() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input variables : ");
        while(in.hasNext()) {
            System.out.print(in.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ex1.inputAllBaseTypes();
    }
}
