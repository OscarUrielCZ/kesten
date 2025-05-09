package com.osq.storage.controllers;

import com.osq.storage.models.File;
import com.osq.storage.services.FileStorageService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileController {

    FileStorageService storageService;

    public FileController(FileStorageService storageService) {
        this.storageService = storageService;
    }

    public File uploadFile(String filepath) throws NoSuchFieldException, IOException {
        // load file bytes
        Path path = Paths.get(filepath);
        if (!Files.exists(path)) {
            throw new NoSuchFileException("File doesn't exist: " + path.toAbsolutePath());
        }

        byte[] fileContent = Files.readAllBytes(path);

        // create and upload file
        File f = File.builder()
                .filepath(path.getFileName().toString())
                .content(fileContent)
                .build();
        this.storageService.uploadFile(f);

        // return response
        return f;
    }

    public boolean existsFile(String filepath) {
        String filename = Paths.get(filepath).getFileName().toString();

        return this.storageService.fileExists(filename);
    }
}
