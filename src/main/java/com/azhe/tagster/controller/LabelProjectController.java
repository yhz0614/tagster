package com.azhe.tagster.controller;


import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.azhe.tagster.mapper.FolderManageMapper;
import com.azhe.tagster.mapper.LabelingProjectMapper;
import com.azhe.tagster.pojo.dao.file.FolderManageDao;
import com.azhe.tagster.pojo.dao.label.ProjectAllocationDao;
import com.azhe.tagster.pojo.vo.FilesContentVo;
import com.azhe.tagster.service.projectLabeling.LabelingProjectService;
import com.azhe.tagster.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author: azhe
 * @description: 标注人员项目操作
 * @date: 2023/12/2 15:37
 */
@RestController
@RequestMapping("/labeling")
@Validated
@CrossOrigin
public class LabelProjectController {

    @Resource
    LabelingProjectService labelingProjectService;
    @Resource
    FolderManageMapper folderManageMapper;

    //查询标注人员标注任务
    @GetMapping("filesList")
    public Result<?> getLabelFilesList(@RequestParam("labelId") Integer labelId){
        List<ProjectAllocationDao> projectAllocation = labelingProjectService.selectListByLabelId(labelId);
        List<Map<String, Object>> filesList = new ArrayList<>();
        for (ProjectAllocationDao info:projectAllocation){
            Map<String,Object> file = new HashMap<>();
            file.put("projectId",info.getProjectId());
            file.put("folderName",info.getFolderName());
            file.put("createDate", DateUtil.date(info.getCreateDate()).toString());
            filesList.add(file);
        }
        return Result.ok("成功", JSON.toJSON(filesList));
    }
    //查询文件夹内文件信息
    @PostMapping("ContentList")
    public Result<?> getLabelContentList(@RequestBody FolderManageDao folderManageDao){
        Integer projectId = folderManageDao.getProjectId();
        String folderName = folderManageDao.getFolderName();
        List<FilesContentVo>  filesContentVos = folderManageMapper.selectContentList(projectId,folderName);
        List<Map<String,Object>> ContentList = new ArrayList<>();
        for (FilesContentVo filesContentVo:filesContentVos){
            Map<String,Object> content = new HashMap<>();
            content.put("fileName",filesContentVo.getFileName());
            content.put("content",filesContentVo.getContent());
            ContentList.add(content);
        }
        return Result.ok("成功",JSON.toJSON(ContentList));
    }


}
