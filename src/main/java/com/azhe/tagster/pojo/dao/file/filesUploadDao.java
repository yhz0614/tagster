package com.azhe.tagster.pojo.dao.file;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;

/**
 * @author: azhe
 * @description: 文件上传实体
 * @date: 2023/11/21 20:36
 */
@Data
@TableName("upload_files")
@Getter
public class filesUploadDao {

    private Integer projectId;

    private String fileName;

    private String fileType;

    private String fileAddress;
    @TableId
    private String uuid;

    private boolean deleted;

    public filesUploadDao(Integer projectId, String fileName, String fileType, String fileAddress, String uuid, boolean deleted) {
        this.projectId = projectId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileAddress = fileAddress;
        this.uuid = uuid;
        this.deleted = deleted;
    }

    public filesUploadDao() {
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean deleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        deleted = deleted;
    }
}
