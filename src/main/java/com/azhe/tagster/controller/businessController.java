package com.azhe.tagster.controller;

import com.azhe.tagster.service.businessService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;

/**
 * @author: azhe
 * @description: 业务人员controller
 * @date: 2023/11/17 00:11
 */

@RestController
@RequestMapping("/business")
@Validated
public class businessController {
    @Resource
    private businessService BusinessService;

    //通过邮箱注册


}
