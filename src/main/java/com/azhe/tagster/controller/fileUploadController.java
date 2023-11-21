package com.azhe.tagster.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.azhe.tagster.pojo.dao.file.filesUploadDao;
import com.azhe.tagster.service.fileUpload.filesUploadService;
import com.azhe.tagster.util.Result;
import com.azhe.tagster.util.fileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author: azhe
 * @description: 文件上传
 * @date: 2023/11/21 17:18
 */
@RestController
@RequestMapping("/upload")
@Validated
@CrossOrigin
public class fileUploadController {

    @Resource
    private filesUploadService FilesUploadService;

    @PostMapping("/file")
    public Result<?> fileUpload(@RequestParam("file") MultipartFile file,@RequestParam("projectId") Integer projectId) throws IOException {
        //获取文件原始名称
        String originalFilename = file.getOriginalFilename();
        System.out.println("文件名是："+ originalFilename);
        //获取文件的类型
        String type = FileUtil.extName(originalFilename);
        System.out.println("文件类型是：" + type);
        //定义一个文件唯一标识码（UUID）
        String uuid = UUID.randomUUID().toString();
        //修改文件名，防止文件名冲突
        String newFileName = uuid+"."+type;
        //保存文件
        try{
            fileUploadUtil.saveFile(newFileName, file);
        }
        catch (IOException e){
            return Result.fail("上传失败");
        }
        //文件信息存入数据库
        filesUploadDao filesInfo = new filesUploadDao();
        String fileAddress = "/Applications/code/java/tagster/files/uploadFiles";
        FilesUploadService.insertUploadFile(projectId,originalFilename,type,fileAddress,uuid);
        return Result.ok("上传成功");

    }
    @PostMapping("/files")
    public Result<?> filesUpload(@RequestParam("files") MultipartFile[] files,Integer projectId) throws IOException {
        //获取文件原始名称
        for (MultipartFile file : files) {
            String originalFilename = file.getOriginalFilename();
            //获取文件的类型
            String type = FileUtil.extName(originalFilename);
            System.out.println("文件类型是：" + type);
            //获取文件大小
            //定义一个文件唯一标识码（UUID）
            String uuid = UUID.randomUUID().toString();
            //修改文件名，防止文件名冲突
            String newFileName = uuid+"."+type;
            //保存文件
            try {
                fileUploadUtil.saveFile(newFileName, file);
            } catch (IOException e) {
                return Result.fail(originalFilename+"上传失败");
            }
        }

        return Result.ok("全部文件上传成功");
    }
}
