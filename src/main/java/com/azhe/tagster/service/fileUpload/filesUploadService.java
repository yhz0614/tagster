package com.azhe.tagster.service.fileUpload;

import com.azhe.tagster.pojo.dao.file.filesUploadDao;
import org.springframework.web.multipart.MultipartFile;

public interface filesUploadService {
    void insertUploadFile(Integer projectId, String fileName, String fileType, String fileAddress, String uuid);


}

