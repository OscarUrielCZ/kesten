package com.osq.storage.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Config {
    private final String LOCAL_PATH = "/home/oscar/kasten/storage/";

    public void setUp() {
        Path rootDirPath = Paths.get(LOCAL_PATH);
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
