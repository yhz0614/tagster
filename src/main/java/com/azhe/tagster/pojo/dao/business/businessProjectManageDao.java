package com.azhe.tagster.pojo.dao.business;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

/**
 * @author: azhe
 * @description: 业务人员项目管理表
 * @date: 2023/11/20 19:54
 */
@Getter
@Data
@TableName("business_project_manage")
public class businessProjectManageDao {
    /**
     * 项目id
     */
    @TableId
    private Integer projectId;
    /**
     * 业务人员id
     */
    private Integer businessId;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 项目类型
     */
    private String projectType;
    /**
     * 创建时间
     */
    private Date createDate;

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public businessProjectManageDao() {
    }

    public businessProjectManageDao(Integer projectId, Integer businessId, String projectName, String projectType, Date createDate) {
        this.projectId = projectId;
        this.businessId = businessId;
        this.projectName = projectName;
        this.projectType = projectType;
        this.createDate = createDate;
    }




    }
