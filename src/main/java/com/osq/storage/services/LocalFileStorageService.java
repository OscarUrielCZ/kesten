package com.osq.storage.services;

import com.osq.storage.config.Config;
import com.osq.storage.models.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class LocalFileStorageService implements FileStorageService {

    private final Config config;

    public LocalFileStorageService(Config config) {
        this.config = config;
    }

    @Override
    public void uploadFile(File file) throws IOException {
        Path filepath = Paths.get(config.STORAGE_URI, file.filepath());
        Files.write(filepath, file.content());
    }

    @Override
    public Optional<File> dowloadFile(String filepath) {
        return null;
    }

    @Override
    public boolean fileExists(String filepath) {
        return Files.exists(Paths.get(config.STORAGE_URI, filepath));
    }

    @Override
    public void createDirectory(String dirpath) {

    }

    @Override
    public void deleteFile(String filepath) {

    }

    @Override
    public void deleteDirectory(String dirpath) {

    }

    @Override
    public List<File> listFiles(String dirpath) {
        return List.of();
    }
}
