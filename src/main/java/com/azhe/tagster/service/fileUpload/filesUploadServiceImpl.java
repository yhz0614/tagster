package com.azhe.tagster.service.fileUpload;

import com.azhe.tagster.mapper.filesUploadMapper;
import com.azhe.tagster.mapper.projectManageMapper;
import com.azhe.tagster.pojo.dao.business.businessProjectManageDao;
import com.azhe.tagster.pojo.dao.file.filesUploadDao;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

/**
 * @author: azhe
 * @description: 文件上传service
 * @date: 2023/11/21 21:39
 */
@Service
@Validated
public class filesUploadServiceImpl implements filesUploadService {
    @Resource
    private filesUploadMapper FilesUploadMapper;
    public  void insertUploadFile(Integer projectId, String fileName, String fileType, String fileAddress, String uuid){
        filesUploadDao filesInfo  = new filesUploadDao();
        filesInfo.setProjectId(projectId);
        filesInfo.setFileName(fileName);
        filesInfo.setFileType(fileType);
        filesInfo.setFileAddress(fileAddress);
        filesInfo.setUuid(uuid);
        FilesUploadMapper.insert(filesInfo);

    }
}
