package arrays;

/**
 * Created by Liam on 04/04/2017.
 */
class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}

public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Integer[] ints2 =
            new ClassParameter<Integer>().f(ints);
        Double[] double2 =
            new ClassParameter<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        double2 = MethodParameter.f(doubles);
    }
}