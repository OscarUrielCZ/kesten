package com.osq.storage.services;

import com.osq.storage.models.File;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface FileStorageService {
    void uploadFile(File file) throws IOException;
    Optional<File> dowloadFile(String filepath);
    boolean fileExists(String filepath);
    void createDirectory(String dirpath);
    void deleteFile(String filepath);
    void deleteDirectory(String dirpath);
    List<File> listFiles(String dirpath);
}
