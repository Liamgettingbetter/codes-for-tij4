package practice.datastructure.chapter1;

public class ex18 {
    static boolean isEqualNum(float[] temp) {
        for(int i = 0; i < temp.length - 1; i++)
            for(int j =  i + 1; j < temp.length; j++) {
                if(temp[i] == temp[j]) return true;
            }
        return false;
    }

    public static void main(String[] args) {
        float[] a = { 1.1f, 1.2f, 1.6f, 1.1f };
        System.out.println(isEqualNum(a));
    }
}
