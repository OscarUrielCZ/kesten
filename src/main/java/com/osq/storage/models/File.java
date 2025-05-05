package com.osq.storage.models;

import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class File {
    String filepath;
    byte[] content;
}
