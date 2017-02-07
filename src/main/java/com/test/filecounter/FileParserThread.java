package com.test.filecounter;

import java.io.File;

/**
 * Created by cube on 01.02.2017.
 */
public class FileParserThread implements Runnable {
    private final int number;
    private final String path;


    public FileParserThread(int number, String path) {
        this.number = number;
        this.path = path;
    }

    @Override
    public void run() {
        FileParser fileParser = new FileParser();
        int counter = fileParser.getRealFiles(new File(path.trim()));

    }
}
