package io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Liam on 12/04/2017.
 */
interface Strategy {
    void process(File file);
}

public class ProcessFiles {
    private Strategy strategy;
    private String text;

    public ProcessFiles(Strategy strategy, String text) {
        this.strategy = strategy;
        this.text = text;
    }

    public void processDirectoryTree(File root) throws IOException {
        for(File f : Directory.walk(root.getAbsolutePath(),
                ".*\\." + text))
            strategy.process(f.getCanonicalFile());
    }

    public void start(String[] args) {
        try {
            if(args.length == 0)
                processDirectoryTree(new File("."));
            else
                for(String arg : args) {
                    File fArg = new File(arg);

                    if(fArg.isDirectory())
                        processDirectoryTree(fArg);
                    else {
                        if(!arg.endsWith("." + text))
                            arg += "." + text;
                        strategy.process(new File(arg).getCanonicalFile());
                    }
                }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}