package com.osq.storage.models;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@Builder
public class File {
    String filepath;
    byte[] content;
}
