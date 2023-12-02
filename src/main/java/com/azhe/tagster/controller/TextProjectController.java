package com.azhe.tagster.controller;

import com.azhe.tagster.mapper.projectManageMapper;
import com.azhe.tagster.pojo.dao.business.businessProjectManageDao;
import com.azhe.tagster.pojo.dao.file.filesUploadDao;
import com.azhe.tagster.pojo.dto.textTagDto;
import com.azhe.tagster.service.business.businessProjectManageService;
import com.azhe.tagster.service.fileUpload.filesUploadService;
import com.azhe.tagster.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: azhe
 * @description: 文本标注
 * @date: 2023/11/19 21:44
 */
@RestController
@RequestMapping("/textProject")
@Validated
@CrossOrigin
public class TextProjectController {
    @Resource
    private businessProjectManageService BusinessProjectManageService;
    private filesUploadService FilesUploadService;

    @Autowired
    private projectManageMapper ProjectManageMapper;
    // 创建文本标注项目
    @PostMapping("/addTextProject")
    public Result<String> addTextProject(@RequestBody businessProjectManageDao textProjectInfo){
        String projectName = textProjectInfo.getProjectName();
        Integer businessId = textProjectInfo.getBusinessId();
        String projectType = "text";
        //写入数据库
        BusinessProjectManageService.insertProjectInfo(projectName,businessId,projectType);
        return Result.ok("创建成功");
    }


    //获取word或pdf中的文本
    @PostMapping("/getContent")
    public Result<String> getContent(@RequestBody filesUploadDao fileInfo){
        Integer projectId = fileInfo.getProjectId();
        String fileName =fileInfo.getFileName();
        // 查询文件文本信息
        return Result.ok("成功",ProjectManageMapper.selectContentByPandF(projectId,fileName));

    }

    //存储文本标注的标签字段
    @PostMapping("/getTextTag")
    public Result<?> registerBusiness(@RequestBody textTagDto tagInfo) {
        String projectName = tagInfo.getProjectName();
        List<String> tagValue = tagInfo.getTagValue();
        System.out.println(projectName);
        for (String string : tagValue) {
            System.out.println(string);
        }
        return Result.ok("创建字段成功");

    }



}
