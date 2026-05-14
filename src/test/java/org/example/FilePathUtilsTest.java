package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilePathUtilsTest {

    @Test
    void testPathCompatibility() {

        String expected = "data/config.txt";

        String actual =
                FilePathUtils.getStandardPath(
                        "data",
                        "config.txt"
                );

        assertEquals(expected, actual);
    }
}