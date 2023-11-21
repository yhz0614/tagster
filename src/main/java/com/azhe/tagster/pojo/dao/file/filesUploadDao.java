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
    private String md5;

    private boolean isDelete;

    public filesUploadDao(Integer projectId, String fileName, String fileType, String fileAddress, String md5, boolean isDelete) {
        this.projectId = projectId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileAddress = fileAddress;
        this.md5 = md5;
        this.isDelete = isDelete;
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

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
