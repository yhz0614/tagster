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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}
