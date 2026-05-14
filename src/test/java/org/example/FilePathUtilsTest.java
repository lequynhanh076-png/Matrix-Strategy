package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;

public class FilePathUtilsTest {

    @Test
    void testPathWithMatrixFailure() {
        String folder = "data";
        String file = "config.txt";
        String expected = "data" + File.separator + "config.txt";

        assertEquals(expected, FilePathUtils.joinPathWrong(folder, file));
    }

    @Test
    void testPathWithMatrixSuccess() {
        String folder = "data";
        String file = "config.txt";
        String expected = "data" + File.separator + "config.txt";

        assertEquals(expected, FilePathUtils.joinPathCorrect(folder, file));
    }
}