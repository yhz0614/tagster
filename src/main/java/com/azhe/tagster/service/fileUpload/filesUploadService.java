package com.azhe.tagster.service.fileUpload;

public interface filesUploadService {
    void insertUploadFile(Integer projectId, String fileName, String fileType, String fileAddress, String uuid);
}

