package com.azhe.tagster.dao.business;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author: Vainycos
 * @description: 业务人员信息
 * @date: 2023/11/14
 */

@TableName("business_user")
@Data
public class businessUserDao {

    /**
     * 自增ID
     */
    @TableId
    private Long id;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码（加密）
     */
    private String password;
    /**
     * 性别
     */
    private boolean gender;
    /**
     * 国籍
     */
    private String nationality;
    /**
     * ip地址
     */
    private String ipAddress;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 学历
     */
    private String education;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 创建时间
     */
    private Date create_date;

}
