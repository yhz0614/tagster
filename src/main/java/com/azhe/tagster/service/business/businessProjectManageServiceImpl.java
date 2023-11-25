package com.azhe.tagster.service.business;

import com.azhe.tagster.mapper.projectManageMapper;
import com.azhe.tagster.pojo.dao.business.businessProjectManageDao;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

/**
 * @author: azhe
 * @description: 业务人员项目管理
 * @date: 2023/11/20 21:07
 */
@Service
@Validated
public class businessProjectManageServiceImpl implements businessProjectManageService {
    @Resource
    private projectManageMapper ProjectManageMapper;
    //创建项目
    public  void insertProjectInfo(String projectName, Integer businessId, String type){
        businessProjectManageDao projectInfo = new businessProjectManageDao();
        projectInfo.setProjectName(projectName);
        projectInfo.setBusinessId(businessId);
        projectInfo.setProjectType(type);
        ProjectManageMapper.insert(projectInfo);

    }


}
