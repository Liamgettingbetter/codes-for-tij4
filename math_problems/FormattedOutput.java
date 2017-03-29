package math_problems;

/**
 * Created by Liam on 29/03/2017.
 */
public class FormattedOutput {
    /**
     *  To output a table that rowed by 10 numbers.
     *  @param size the total numbers to be output.
     */
    static void output(int size) {
        int newLine = 0;

        for(int i = 0; i < size; i++) {
            System.out.printf("%4d", (i + 1));

            newLine++;

            if(newLine % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        output(100);
    }
}
