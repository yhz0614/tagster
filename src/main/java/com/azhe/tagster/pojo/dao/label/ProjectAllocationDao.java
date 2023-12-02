package com.azhe.tagster.pojo.dao.label;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

/**
 * @author: azhe
 * @description: 标注人员项目分配表
 * @date: 2023/12/2 15:53
 */
@Getter
@TableName("project_allocation_label")
@Data
public class ProjectAllocationDao {
    /**
     * 自增ID
     */
    @TableId
    private Long id;
    /**
     * 标注人员id
     */
    private Integer labelId;
    /**
     * 项目id
     */
    private Integer projectId;
    /**
     * 文件夹名
     */
    private String folderName;

    private Date createDate;


    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public ProjectAllocationDao(Long id, Integer labelId, Integer projectId, String folderName, Date createDate) {
        this.id = id;
        this.labelId = labelId;
        this.projectId = projectId;
        this.folderName = folderName;
        this.createDate = createDate;
    }

    public ProjectAllocationDao() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

}
