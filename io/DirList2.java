package io;

import java.io.File;
import java.util.Arrays;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by Liam on 12/04/2017.
 */
public class DirList2 {
    public static FilenameFilter filter(final String regex) {
        // Creation of anonymous inner class:
        return new FilenameFilter() {
            private Pattern p = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return p.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;

        if(args.length == 0)
            list = path.list();
        else
            list = path.list(filter(args[0]));

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for(String dirItem : list)
            System.out.println(dirItem);
    }
}
