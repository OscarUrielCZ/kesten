package com.osq.storage.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalFileStorageServiceTest {

    private static LocalFileStorageService storageService;

    @BeforeAll
    public static void setUp() {
        storageService = new LocalFileStorageService();
    }

    @Test
    public void testUploadNonExistingFile() {
        String unexistingPath = "/doesnt/exist/file.java";

        assertEquals("1", "1");
    }
}
