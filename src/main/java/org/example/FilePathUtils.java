package org.example;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathUtils {

    public static String joinPathWrong(String folder, String filename) {
        return folder + "/" + filename;
    }

    public static String joinPathCorrect(String folder, String filename) {

        return Paths.get(folder, filename).toString();
    }
}