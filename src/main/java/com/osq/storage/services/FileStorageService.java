package com.osq.storage.services;

import com.osq.storage.models.File;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public interface FileStorageService {
    void uploadFile(File file) throws IOException;
    Optional<File> dowloadFile(String filepath);
    boolean fileExists(String filepath);
    void createDirectory(String dirpath) throws IOException;
    void deleteFile(String filepath) throws IOException;
    void deleteDirectory(String dirpath) throws IOException;
    List<Path> listFiles(String dirpath) throws IOException;
}
