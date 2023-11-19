package com.azhe.tagster.pojo.dao.business;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

/**
 * @author: azhe
 * @description: 业务人员信息
 * @date: 2023/11/14
 */

@Getter
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

    public businessUserDao() {
    }

    public businessUserDao(Long id, String email, String username, String password, boolean gender, String nationality, String ipAddress, String birthday, String education, String industry, Date create_date) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.nationality = nationality;
        this.ipAddress = ipAddress;
        this.birthday = birthday;
        this.education = education;
        this.industry = industry;
        this.create_date = create_date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}
