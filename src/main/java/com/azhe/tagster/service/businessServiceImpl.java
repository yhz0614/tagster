package com.azhe.tagster.service;

import com.azhe.tagster.pojo.dao.business.businessUserDao;
import com.azhe.tagster.mapper.businessInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: azhe
 * @description: 业务人员service
 * @date: 2023/11/17 00:07
 */

@Service
@Validated
public class businessServiceImpl implements businessService{
    @Resource
    private businessInfoMapper BusinessInfoMapper;

    @Override
    public List<businessUserDao> ListBusinessInfoByEmail(String email) {
        return BusinessInfoMapper.selectBusinessInfoByEmail(email);
    }

    @Override
    public String getPasswordByEmail(String email) {
        return BusinessInfoMapper.selectPasswordByEmail(email);
    }

    @Override
    public void insertBusinessInfoByEmail(String email, String password, String userName) {
        BusinessInfoMapper.registerBusinessInfoByEmail(email,password,userName);
    }
}
