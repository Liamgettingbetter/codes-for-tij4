package practice.datastructure.chapter1;

public class ex17 {
    static boolean productEven(int[] temp) {
        for(int i = 0; i < temp.length - 1; i++) {
            for(int j = i + 1; j < temp.length; j++) {
                if(temp[i] != temp[j] && temp[i] * temp[j] % 2 == 0)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 1, 1 };
        System.out.println(productEven(a));
    }
}
