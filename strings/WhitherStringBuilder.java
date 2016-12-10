package strings;

/**
 * Created by Liam on 10/12/2016.
 */
public class WhitherStringBuilder {
    public String implicit(String[] fields) {
        String result = "";
        for(int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }

    public String explicit(String[] fields) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < fields.length; ++i)
            sb.append(fields[i]);
        return sb.toString();
    }
}
