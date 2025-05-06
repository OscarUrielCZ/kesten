package com.osq.storage.controllers;

import com.osq.storage.models.File;
import com.osq.storage.services.FileStorageService;

import java.io.IOException;
import java.nio.file.Files;
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
            throw new NoSuchFieldException("File doesn't exist");
        }

        byte[] fileContent = Files.readAllBytes(path);

        // create and upload file
        File f = File.builder()
                .filepath(filepath)
                .content(fileContent)
                .build();
        this.storageService.uploadFile(f);

        // return response
        return f;
    }
}
