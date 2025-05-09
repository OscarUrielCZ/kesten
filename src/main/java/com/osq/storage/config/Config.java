package com.osq.storage.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// TODO: inject as singleton
public class Config {
    public final String STORAGE_URI = "/home/oscar/kasten/storage/";

    public void setUp() {
        Path rootDirPath = Paths.get(STORAGE_URI);
        if (!Files.exists(rootDirPath)) {
            System.out.println("[INFO]: Creating root directtory");
            try {
                Files.createDirectory(rootDirPath);
            } catch (IOException e) {
                System.out.println("[ERROR]: Unable to create root directory");
            }

        }
    }
}
