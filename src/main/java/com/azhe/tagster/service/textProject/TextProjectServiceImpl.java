package com.azhe.tagster.service.textProject;

import com.azhe.tagster.mapper.TextProjectMapper;
import com.azhe.tagster.pojo.dao.textProject.TextProjectContentDao;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

/**
 * @author: azhe
 * @description: 文本标注内容表数据存储
 * @date: 2023/11/25 16:18
 */
@Service
@Validated
public class TextProjectServiceImpl implements TextProjectService {
    @Resource
    TextProjectMapper textProjectMapper;
    public void insertTextContent(Integer projectId, String uuid, String content){
        TextProjectContentDao textProjectContent = new TextProjectContentDao();
        textProjectContent.setProjectId(projectId);
        textProjectContent.setUuid(uuid);
        textProjectContent.setContent(content);
        textProjectMapper.insert(textProjectContent);
    }

}
