package com.test.filecounter;

import com.test.utils.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by cube on 01.02.2017.
 */
public class Main {
    private final static FileUtils fileUtils = new FileUtils();
    private final static FileParser fileParser = new FileParser();

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(fileParser.getRealFiles(new File("C:\\Users\\Денис\\IdeaProjects")));
        String filesPath = fileUtils.read("input.txt");
        FileParserPool fileParserPool = new FileParserPool();
        fileParserPool.createPool(filesPath);

    }
}
