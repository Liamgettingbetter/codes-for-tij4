package initialization;

/**
 * Created by Liam on 11/4/16.
 */
public class OptionalTrailingArguments {
    /*
        可变参数列表的实现, 目的在于减少方法的重构次数
     */
    static void f(int required, String... trailings) {
        System.out.print("required : " + required + " ");
        for(String s : trailings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}
