package com.osq.storage.controllers;

import com.osq.storage.config.Config;
import com.osq.storage.models.File;
import com.osq.storage.services.LocalFileStorageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

import static org.junit.jupiter.api.Assertions.*;

public class FileControllerTest {

    private FileController fileController;

    @BeforeEach
    public void setUp() {
        fileController = new FileController(new LocalFileStorageService(new Config()));
    }

    @Test
    public void testUploadNonExistingFile() {
        String nonExistingPath = "/doesnt/exist/file.java";

        assertThrows(NoSuchFileException.class, () -> fileController.uploadFile(nonExistingPath));
    }

    @Test
    public void testUploadFile() {
        String path = "src/test/resources/sample-files/example1.txt";
        File response = null;

        try {
            response = fileController.uploadFile(path);
        } catch (NoSuchFieldException | IOException e) {
            fail(e.getMessage());
        }

        assertNotNull(response);
        assertTrue(fileController.existsFile(path));
    }

    @Test
    public void testDownloadFile() {
        String path = "src/test/resources/sample-files/example1.txt";
        File response = null;

        try {
            response = fileController.uploadFile(path);
        } catch (NoSuchFieldException | IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testListFiles() {
        fail("Not yet implemented");
    }

    @Test
    public void testDeleteFile() {
        fail("Not yet implemented");
    }

    @Test
    public void testDeleteNonExistingFile() {
        fail("Not yet implemented");
    }

    @Test
    public void testDeleteDirectory() {
        fail("Not yet implemented");
    }
}
