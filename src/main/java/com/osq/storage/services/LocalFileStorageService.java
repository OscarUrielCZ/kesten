package com.osq.storage.services;

import com.osq.storage.models.File;

import java.util.List;

public class LocalFileStorageService implements FileStorageService {

    @Override
    public void uploadFile(File file) {

    }

    @Override
    public File dowloadFile(String filepath) {
        return null;
    }

    @Override
    public boolean fileExists(String filepath) {
        return false;
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
