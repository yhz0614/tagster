package com.azhe.tagster.pojo.dao.textProject;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;

/**
 * @author: azhe
 * @description: 文本标注文本内容表
 * @date: 2023/11/20 19:48
 */
@Getter

@TableName("text_project_content")
public class TextProjectContentDao {
    /**
     * 项目id
     */
    private Integer projectId;
    /**
     * uuid
     */
    private String uuid;
    /**
     * 文本内容
     */
    private String content;

    public Integer getProjectId() {
        return projectId;
    }

    public String getUuid() {
        return uuid;
    }

    public String getContent() {
        return content;
    }

    public TextProjectContentDao() {
    }

    public TextProjectContentDao(Integer projectId, String content, String uuid) {
        this.projectId = projectId;
        this.uuid = uuid;
        this.content = content;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public void setUuid(String uuid) {this.uuid = uuid; }

}
