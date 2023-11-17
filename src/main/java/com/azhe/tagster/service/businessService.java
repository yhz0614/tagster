package com.azhe.tagster.service;

import com.azhe.tagster.dao.business.businessUserDao;

import java.util.List;

public interface businessService {
    List<businessUserDao> ListBusinessInfoByEmail(String email);

    String getPasswordByEmail(String email);

    void insertBusinessInfoByEmail(String email, String password, String userName);


}
