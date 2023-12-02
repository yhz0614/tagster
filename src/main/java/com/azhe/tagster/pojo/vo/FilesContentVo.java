package com.azhe.tagster.pojo.vo;

import lombok.Data;
import lombok.Getter;

/**
 * @author: azhe
 * @description: 文件内容
 * @date: 2023/12/2 18:19
 */
@Getter
@Data
public class FilesContentVo {
    private String fileName;
    private String content;

    public FilesContentVo(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public FilesContentVo() {
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
