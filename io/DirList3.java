package io;

import java.io.File;
import java.io.FilenameFilter;

import java.util.regex.*;

/**
 * Created by Liam on 12/04/2017.
 */
public class DirList3 {
    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;

        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                private Pattern p = Pattern.compile(args[0]);

                @Override
                public boolean accept(File dir, String filename) {
                    return p.matcher(filename).matches();
                }
            });

    }
}
