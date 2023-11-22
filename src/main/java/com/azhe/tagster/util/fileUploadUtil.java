package com.azhe.tagster.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author: azhe
 * @description: 文件上传工具类
 * @date: 2023/11/21 20:04
 */
@Component
public class fileUploadUtil {
//    @Value("${file.upload.dir}") // 从配置文件中读取文件上传目录
    private static final String uploadDir = "E:/IntelliJ IDEA/tagster/files/uploadFiles";

        public static void saveFile(String fileName, MultipartFile file) throws IOException {
            System.out.println(uploadDir);
            File fileDir = new File(uploadDir);
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
            file.transferTo(new File(uploadDir + "/" + fileName));
        }

        public void deleteFile(String fileName) {
            File file = new File(uploadDir + "/" + fileName);
            if (file.exists()) {
                file.delete();
            }
        }


}
