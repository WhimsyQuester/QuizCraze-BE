package com.whimsyquester.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.whimsyquester.entity.enums.DateTimePatternEnum;
import com.whimsyquester.utils.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.po
 * @ClassName: AppUserInfo
 * @Datetime: 2023/11/20 02:36
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示用户信息
 */

public class AppUserInfo implements Serializable {


    /**
     * 用户ID
     */
    private String userId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别 0:女 1:男
     */
    private Integer sex;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date joinTime;

    /**
     * 最后登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    /**
     * 最后使用的设备ID
     */
    private String lastUseDeviceId;

    /**
     * 手机品牌
     */
    private String lastUseDeviceBrand;

    /**
     *
     */
    private String lastLoginIp;

    /**
     * 0:禁用 1:正常
     */
    private Integer status;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getJoinTime() {
        return this.joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastUseDeviceId() {
        return this.lastUseDeviceId;
    }

    public void setLastUseDeviceId(String lastUseDeviceId) {
        this.lastUseDeviceId = lastUseDeviceId;
    }

    public String getLastUseDeviceBrand() {
        return this.lastUseDeviceBrand;
    }

    public void setLastUseDeviceBrand(String lastUseDeviceBrand) {
        this.lastUseDeviceBrand = lastUseDeviceBrand;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "用户ID:" + (userId == null ? "空" : userId) + "，邮箱:" + (email == null ? "空" : email) + "，昵称:" + (nickName == null ? "空" : nickName) + "，头像:" + (avatar == null ? "空" : avatar) + "，密码:" + (password == null ? "空" : password) + "，性别 0:女 1:男:" + (sex == null ? "空" : sex) + "，创建时间:" + (joinTime == null ? "空" : DateUtil.format(joinTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "，最后登录时间:" + (lastLoginTime == null ? "空" : DateUtil.format(lastLoginTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "，最后使用的设备ID:" + (lastUseDeviceId == null ? "空" : lastUseDeviceId) + "，手机品牌:" + (lastUseDeviceBrand == null ? "空" : lastUseDeviceBrand) + "，lastLoginIp:" + (lastLoginIp == null ? "空" : lastLoginIp) + "，0:禁用 1:正常:" + (status == null ? "空" : status);
    }
}

