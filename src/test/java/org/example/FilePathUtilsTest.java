package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;

public class FilePathUtilsTest {
    @Test
    void testPathCompatibility() {
        String folder = "data";
        String file = "config.txt";

        String expected = "data" + File.separator + "config.txt";

        assertEquals(expected, FilePathUtils.getStandardPath(folder, file));
    }
}