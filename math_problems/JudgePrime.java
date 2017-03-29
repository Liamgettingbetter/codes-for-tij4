package math_problems;

/**
 * Created by Liam on 29/03/2017.
 */
public class JudgePrime {
    /**
     * To test whether a number is a Prime Number.
     * @param num the tested number.
     * @return a boolean variable representing true, if the tested number is a prime number, otherwise false.
     */
    static boolean isPrime(int num) {
        for(int i = 2; i * i < num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    // Unit Test
    public static void main(String[] args) {
        System.out.println(isPrime(123));
        System.out.println(isPrime(345));
        System.out.println(isPrime(371));
    }
}
