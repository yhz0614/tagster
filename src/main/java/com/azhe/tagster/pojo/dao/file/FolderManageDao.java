package com.azhe.tagster.pojo.dao.file;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;

/**
 * @author: azhe
 * @description: 项目文件夹管理表
 * @date: 2023/12/2 17:16
 */
@Getter
@Data
@TableName("file_folder_manage")
public class FolderManageDao {
    /**
     * 自增ID
     */
    @TableId
    private Long id;
    /**
     * 项目id
     */
    private Integer projectId;
    /**
     * 文件夹名
     */
    private String folderName;
    /**
     * 文件uuid
     */
    private String uuid;

    public FolderManageDao(Long id, Integer projectId, String folderName, String uuid) {
        this.id = id;
        this.projectId = projectId;
        this.folderName = folderName;
        this.uuid = uuid;
    }

    public FolderManageDao() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
