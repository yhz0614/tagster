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
public class textProjectContentDao {
    /**
     * 项目id
     */
    private Integer projectId;
    /**
     * 文本id
     */
    private Integer contentId;
    /**
     * 文本内容
     */
    private String content;

    public textProjectContentDao() {
    }

    public textProjectContentDao(Integer projectId, Integer contentId, String content) {
        this.projectId = projectId;
        this.contentId = contentId;
        this.content = content;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
