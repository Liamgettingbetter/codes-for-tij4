package strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by Liam on 15/12/2016.
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage:\njava TestRegularException " +
                "characterSequence regularExcepression+");
            System.exit(0);
        }
        System.out.println("Input : \"" + args[0] + "\"");
        for(String arg : args) {
            System.out.println("Regular expression : \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while(m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " +
                    m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
