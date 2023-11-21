package com.azhe.tagster.controller;

import cn.hutool.json.JSONObject;
import com.azhe.tagster.enums.responseCode;
import com.azhe.tagster.pojo.dao.business.businessProjectManageDao;
import com.azhe.tagster.pojo.dto.textTagDto;
import com.azhe.tagster.service.businessProjectManageService;
import com.azhe.tagster.service.businessService;
import com.azhe.tagster.util.Result;
import org.springframework.http.ResponseEntity;
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
public class textProjectController {
    @Resource
    private businessProjectManageService BusinessProjectManageService;
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

    //上传文本文件



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
