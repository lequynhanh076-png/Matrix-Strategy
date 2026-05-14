package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FilePathUtilsTest {
    @Test
    void testPathCompatibility() {
        String folder = "data";
        String file = "config.txt";
        String expected = "data/config.txt"; // Mong muốn chung cho mọi OS

        // Cả 3 OS đều sẽ trả về data/config.txt sau khi đã replace
        assertEquals(expected, FilePathUtils.getStandardPath(folder, file));
    }
}