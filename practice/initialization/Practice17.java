package practice.initialization;

import java.util.Arrays;

/**
 * Created by Liam on 11/4/16.
 */
class PrintString {
    private String s;

    PrintString(String s) {
        s = this.s;
        System.out.print(s + " ");
    }

    @Override
    public String toString() {
        return s;
    }
}
public class Practice17 {
    public static void main(String[] args) {
        PrintString[] ps = new PrintString[10];
        for(int i = 0; i < ps.length; i++) {
            ps[i] = new PrintString("Deadpool");
        }
        System.out.println(Arrays.toString(ps));
    }
}
