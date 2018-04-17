package practice.datastructure.chapter1;

public class ex3 {
    static boolean isMultiple(long a, long b) {
        return a % b == 0;
    }

    public static void main(String[] args) {
        boolean a = isMultiple(142890, 11121231);
        System.out.println(a);
    }
}


