package practice.datastructure.chapter1;

import java.util.Scanner;

public class ex8 {
    static int countVowels(String s) {
        int counter = 0;
        for(char a : s.toCharArray()) {
            switch(a) {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    counter++;
                    break;
                default :
                    break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER a text.");
        int result = countVowels(in.next());
        System.out.println("This text has " + result + " vowels.");
    }
}
