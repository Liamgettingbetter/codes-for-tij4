package io;

import java.io.File;
import java.util.Arrays;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by Liam on 10/04/2017.
 */
class DirFilter implements FilenameFilter {
    private Pattern p;

    public DirFilter(String regex) {
        p = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return p.matcher(name).matches();
    }
}

public class DirList1 {
    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;

        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String item : list)
            System.out.println(item);
    }
}
