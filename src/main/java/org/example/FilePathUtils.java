package org.example;

import java.nio.file.Paths;

public class FilePathUtils {
    public static String getStandardPath(String folder, String filename) {

        return Paths.get(folder, filename).toString();
    }
}