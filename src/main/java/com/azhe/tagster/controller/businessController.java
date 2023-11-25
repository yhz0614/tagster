package com.azhe.tagster.controller;

import com.azhe.tagster.pojo.dao.business.businessUserDao;
import com.azhe.tagster.service.business.businessService;
import com.azhe.tagster.util.EncryptSha256Util;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: azhe
 * @description: 业务人员controller
 * @date: 2023/11/17 00:11
 */

@RestController
@RequestMapping("/business")
@Validated
@CrossOrigin
public class businessController {
    @Resource
    private businessService BusinessService;

    //通过邮箱注册
    @PostMapping("/email")
    public ResponseEntity<String> registerBusiness(@RequestBody businessUserDao registerInfo) {
        String email = registerInfo.getEmail();
        String password = EncryptSha256Util.sha256Hex(registerInfo.getPassword());
        String userName = registerInfo.getUsername();
        System.out.println(password);
        // 密码加密
        return ResponseEntity.ok("BusinessUser registered successfully");
    }


}
