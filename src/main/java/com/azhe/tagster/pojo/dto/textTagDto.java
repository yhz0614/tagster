package com.azhe.tagster.pojo.dto;

import lombok.Data;
import lombok.Getter;

import java.util.List;

/**
 * @author: azhe
 * @description: 文本标签对象
 * @date: 2023/11/18 21:14
 */
@Getter
@Data
public class textTagDto {
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 标签列表
     */
    private List<String> tagValue;

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setTagValue(List<String> tagValue) {
        this.tagValue = tagValue;
    }

    public textTagDto() {
    }

    public textTagDto(String projectName, List<String> tagValue) {
        this.projectName = projectName;
        this.tagValue = tagValue;
    }
}
