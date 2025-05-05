package com.osq.storage.services;

import com.osq.storage.models.File;

import java.util.List;

public interface FileStorageService {
    void uploadFile(File file);
    File dowloadFile(String filepath);
    boolean fileExists(String filepath);
    void createDirectory(String dirpath);
    void deleteFile(String filepath);
    void deleteDirectory(String dirpath);
    List<File> listFiles(String dirpath);
}
