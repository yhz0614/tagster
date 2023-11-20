package com.azhe.tagster.mapper;

import com.azhe.tagster.pojo.dao.business.businessProjectManageDao;
import com.azhe.tagster.pojo.dao.business.businessUserDao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface businessInfoMapper extends BaseMapper<businessUserDao> {
     //根据邮箱查询标注人员信息/也可以查询邮箱是否已经注册
    @Select("select * from business_user where email = #{email}")
    List<businessUserDao> selectBusinessInfoByEmail(@Param("email") String email);
//    default List<businessUserDao> selectBusinessInfoByEmail(String email){
//        return selectList(businessUserDao::getEmail,email);
//    }

    // 根据邮箱验证密码
    @Select("select password from business_user where email = #{email}")
    String selectPasswordByEmail(@Param("email") String email);

    //通过邮箱注册业务人员账号
    @Insert("INSERT INTO business_user(email, password, user_name) VALUES(#{email}, #{password}, #{userName})")
    void registerBusinessInfoByEmail(@Param("email") String email, @Param("password") String password, @Param("userName") String userName);

}
